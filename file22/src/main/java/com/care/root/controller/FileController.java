package com.care.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("upload")
	public String upload(MultipartHttpServletRequest mul) {
		String id = mul.getParameter("id");
		String name = mul.getParameter("name");
		MultipartFile f = mul.getFile("file");
		fs.fileProcess(mul);
		
		return "redirect:form";
	}
}
