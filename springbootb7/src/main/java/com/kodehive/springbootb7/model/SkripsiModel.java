package com.kodehive.springbootb7.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Buat Model Skripsi
// Auto Incerent PK

// Int id
// String nama_skripsi
// int tahun
// int nilai

@Entity
@Table
public class SkripsiModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nama_skripsi;
	private int tahun;
	private int nilai;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama_skripsi() {
		return nama_skripsi;
	}
	public void setNama_skripsi(String nama_skripsi) {
		this.nama_skripsi = nama_skripsi;
	}
	public int getTahun() {
		return tahun;
	}
	public void setTahun(int tahun) {
		this.tahun = tahun;
	}
	public int getNilai() {
		return nilai;
	}
	public void setNilai(int nilai) {
		this.nilai = nilai;
	}
	
	

}
