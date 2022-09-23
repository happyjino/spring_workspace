package com.care.root.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.care.root.dto.FileDTO;
import com.care.root.mybatis.FileMapper;

@Service
public class FileServiceImpl {
	public static String IMAGE_REPO;
	
	@Autowired FileMapper fm;
	
	static {
		IMAGE_REPO = "C:/spring/image_repo/";
	}
	public void fileProcess(MultipartHttpServletRequest mul) {
		MultipartFile file = mul.getFile("file");
		FileDTO dto = new FileDTO();
		
		dto.setId(mul.getParameter("id"));
		dto.setName(mul.getParameter("name"));
		
		if(file.getSize() != 0) {
			SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss-");
			String fileName = f.format(new Date());
			fileName += file.getOriginalFilename();
			
			dto.setImgName(fileName);
			
			File saveFile = new File(IMAGE_REPO+fileName);
			try {
				file.transferTo(saveFile);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}else { // 이미지 선택 x인 경우!
			dto.setImgName("nan");
		}
		
		fm.saveData(dto);
		
	}
}
