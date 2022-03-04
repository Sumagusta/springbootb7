package com.kodehive.springbootb7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController2 {
	
	@RequestMapping("kodehive/mahasiswa")
	public String home2() {
		String html2 = "kampus/kelas/mahasiswa";
		return html2;
		
	}
	

}
