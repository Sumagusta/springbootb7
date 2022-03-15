package com.kodehive.springbootb7.controller.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kodehive.springbootb7.model.MahasiswaModel;
import com.kodehive.springbootb7.service.MahasiswaService;

@RestController
public class MahasiswaApi {
	
	@Autowired
	MahasiswaService mahasiswaService;

	@GetMapping("/api/get")
	private List<MahasiswaModel> home() {
		List<MahasiswaModel> mahasiswaModelList = new ArrayList<MahasiswaModel>();
		mahasiswaModelList = mahasiswaService.read();
		return mahasiswaModelList;
	}
	
	@PostMapping("/api/post")
	@ResponseStatus(code = HttpStatus.CREATED)
	private Map<String, Object> post(@RequestBody MahasiswaModel mahasiswaModel){
		
		mahasiswaService.create(mahasiswaModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("succes", Boolean.TRUE);
		map.put("pesan", "insert api sukses");
		return map;
	}
	
	@PutMapping("/api/put")
	@ResponseStatus(code = HttpStatus.OK)
	private Map<String, Object> put(@RequestBody MahasiswaModel mahasiswaModel){
		
		mahasiswaService.update(mahasiswaModel);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("succes", Boolean.TRUE);
		map.put("pesan", "update api sukses");
		return map;
	}
	
	@DeleteMapping("/api/delete/{no_mhs}")
	@ResponseStatus(code = HttpStatus.OK)
	private Map<String, Object> put(@PathVariable Integer no_mhs){
		
		mahasiswaService.delete(mahasiswaService.searchIdMahasiswa(no_mhs));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("succes", Boolean.TRUE);
		map.put("pesan", "delete api sukses");
		return map;
	}
	
}
