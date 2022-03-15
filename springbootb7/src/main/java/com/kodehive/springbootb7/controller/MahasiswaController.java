package com.kodehive.springbootb7.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodehive.springbootb7.model.JurusanModel;
import com.kodehive.springbootb7.model.MahasiswaModel;
import com.kodehive.springbootb7.service.JurusanService;
import com.kodehive.springbootb7.service.MahasiswaService;

@Controller
public class MahasiswaController {
	
	@Autowired
	private MahasiswaService mahasiswaService;
	
	@Autowired
	private JurusanService jurusanService;

	@RequestMapping("/mahasiswa/home")
	public String home() {
		return "mahasiswa/home";
	}
	
	@RequestMapping("/mahasiswa/add")	
	public String add(Model model) {
		listJurusan(model); // panggil method listJurusan supaya ketika modal add di trigger maka list jurusan method akan dijalankan
		return "mahasiswa/add";
	}
	
	@RequestMapping("/mahasiswa/create")
	public String create(HttpServletRequest request) {
		String namaMahasiswa = request.getParameter("namaMahasiswa");
		String jk = request.getParameter("jk");
		String alamat = request.getParameter("alamat");
		String jurusan = request.getParameter("jurusan");
		String status = request.getParameter("status");
		
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel.setNm_mhs(namaMahasiswa);
		mahasiswaModel.setJk(jk);
		mahasiswaModel.setAlamat(alamat);
		mahasiswaModel.setStatus(status);
		mahasiswaModel.setKd_jurusan(jurusan);
		
		mahasiswaService.create(mahasiswaModel);
		
		return "mahasiswa/home";
	}
	
	@RequestMapping("/mahasiswa/list")
	private String listMahasiswa(Model model) {
		List<MahasiswaModel> mahasiswaModelList = new ArrayList<MahasiswaModel>();
		mahasiswaModelList = mahasiswaService.read();
		
		model.addAttribute("readMahasiswa", mahasiswaModelList);
		
		return "/mahasiswa/list";
	}
	
	private void listJurusan(Model model) {
		List<JurusanModel> jurusanModelList = new ArrayList<JurusanModel>();
		jurusanModelList = jurusanService.read();
		
		model.addAttribute("jurusanModelList", jurusanModelList);
	}
	
	private String edit(HttpServletRequest request) {
		
		String kd_mhs = request.getParameter("kd_mhs");
		
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel = mahasiswaService.searchIdMahasiswa(Integer.valueOf(kd_mhs));
		
		return null;
	}
	
	//pop up delete
	@RequestMapping("/mahasiswa/remove")
	private String remove(HttpServletRequest request, Model model) {
		String no_mhs = request.getParameter("no_mhs");
		
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel = mahasiswaService.searchIdMahasiswa(Integer.valueOf(no_mhs));
		
		model.addAttribute("bingkisanDelete", mahasiswaModel);
		return "/mahasiswa/remove";
	}
	
	// fungsi delete
	@RequestMapping("/mahasiswa/delete")
	private String delete(HttpServletRequest request) {
		Integer no_mhs = Integer.valueOf(request.getParameter("no_mhs"));
		
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel = mahasiswaService.searchIdMahasiswa(no_mhs);
		
		mahasiswaService.delete(mahasiswaModel);
		
		return "/mahasiswa/home";
	}
	
}
