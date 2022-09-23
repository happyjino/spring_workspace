package com.care.root.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class FileServiceImpl {
	public static String IMAGE_REPO;
	static {
		IMAGE_REPO = "C:/spring/image_repo/";
	}
	public void fileProcess(MultipartHttpServletRequest mul) {
		MultipartFile file = mul.getFile("file");
		if(file.getSize() != 0) {
			File saveFile = new File(IMAGE_REPO+file.getOriginalFilename());
			try {
				file.transferTo(saveFile);
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
