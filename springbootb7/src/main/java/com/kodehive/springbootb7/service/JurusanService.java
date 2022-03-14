package com.kodehive.springbootb7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.springbootb7.model.JurusanModel;
import com.kodehive.springbootb7.repository.JurusanRepository;

@Service
public class JurusanService {

	@Autowired
	JurusanRepository jurusanRepository;
	
	public List<JurusanModel> read() {
		return jurusanRepository.findAll();
	}
}
