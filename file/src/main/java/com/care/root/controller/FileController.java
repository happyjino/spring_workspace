package com.care.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	
	@GetMapping("form")
	public String form() {
		return "uploadForm";
	}
	
	@PostMapping("upload")
	public void upload(@RequestParam String id, @RequestParam String name, @RequestParam MultipartFile file) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(file.getOriginalFilename());
	}

}
