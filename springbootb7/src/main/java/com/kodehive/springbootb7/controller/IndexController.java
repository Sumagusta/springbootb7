package com.kodehive.springbootb7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/home") 
	public String home() {
		String html = "beranda";
		return html;
	}
	
	
}
