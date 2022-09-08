package com.care.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("my/index")
	public String index() {
		return "get_post/index";
	}
}
