package com.kodehive.springbootb7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.springbootb7.model.MahasiswaModel;
import com.kodehive.springbootb7.repository.MahasiswaRepository;

@Service
public class MahasiswaService {

	@Autowired // DI = Dependencies Injection -> Meminimalisir penggunaan instance, jadi tidak perlu instance berkali-kali untk mengambil method dari class/interface lain
	private MahasiswaRepository mahasiswaRepository;
	
	public void read() {
		mahasiswaRepository.findAll();
	}
	
	public void create(MahasiswaModel mahasiswaModel) {
		mahasiswaRepository.save(mahasiswaModel);
	}
	

}
