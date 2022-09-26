package com.care.root.controller;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.care.root.service.FileServiceImpl;

@Controller
public class FileController {
	@Autowired FileServiceImpl fs;
	
	@GetMapping("form")
	public String form() {
		return "uploadForm";
	}
	
	@PostMapping("upload2")
	public void upload(@RequestParam String id, @RequestParam String name, @RequestParam MultipartFile file) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(file.getOriginalFilename());
	}
	@PostMapping("upload")
	public String upload2(MultipartHttpServletRequest mul) {
		String id = mul.getParameter("id");
		String name = mul.getParameter("name");
		MultipartFile f = mul.getFile("file");
		fs.fileProcess(mul);
		
		return "redirect:form";
	}
	@GetMapping("views")
	public String views(Model model) {
		fs.getData(model);
		return "result";
	}
	@GetMapping("download")
	public void download(@RequestParam String file, HttpServletResponse response) throws Exception{
		response.addHeader("Content-disposition", "attachment; fileNmae=" +file);
		// c:/spring/img_repo/+file(실제 파일이름)
		File f = new File(FileServiceImpl.IMAGE_REPO + file);
		FileInputStream in = new FileInputStream(f);
		FileCopyUtils.copy(in, response.getOutputStream());
		in.close();
	}

}
