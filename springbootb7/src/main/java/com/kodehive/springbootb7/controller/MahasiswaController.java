package com.kodehive.springbootb7.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodehive.springbootb7.model.MahasiswaModel;
import com.kodehive.springbootb7.service.MahasiswaService;

@Controller
public class MahasiswaController {
	
	@Autowired
	private MahasiswaService mahasiswaService;

	@RequestMapping("/mahasiswa/home")
	public String home() {
		return "mahasiswa/home";
	}
	
	@RequestMapping("/mahasiswa/add")
	public String add() {
		return "mahasiswa/add";
	}
	
	@RequestMapping("/mahasiswa/create")
	public String create(HttpServletRequest request) {
		String namaMahasiswa = request.getParameter("namaMahasiswa");
		String jk = request.getParameter("jk");
		String alamat = request.getParameter("alamat");
		String status = request.getParameter("status");
		
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel.setNm_mhs(namaMahasiswa);
		mahasiswaModel.setJk(jk);
		mahasiswaModel.setAlamat(alamat);
		mahasiswaModel.setStatus(status);
		
		mahasiswaService.create(mahasiswaModel);
		
		return "mahasiswa/home";
	}
	
}
