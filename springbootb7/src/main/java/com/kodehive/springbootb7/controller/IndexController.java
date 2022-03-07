package com.kodehive.springbootb7.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("kodehive/karyawan")
	public String home() {
		String html = "company/divisi/karyawan";
		return html;
		
	}
	
	@RequestMapping("login/terimaData")
	public String terimaDataUsername(HttpServletRequest request, Model model) {
	
		String tampungDataUsername = request.getParameter("username");
		
		model.addAttribute("namaDataResponse", tampungDataUsername);
		return "terimaDataPage";	
	}
	

}
