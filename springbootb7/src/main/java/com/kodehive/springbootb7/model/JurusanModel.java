package com.kodehive.springbootb7.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class JurusanModel {

	@Id
	private String kd_jurusan;
	private String nm_jurusan;
	private String kd_fakultas;
	private int spp;
	private String status;
	
	public String getKd_jurusan() {
		return kd_jurusan;
	}
	public void setKd_jurusan(String kd_jurusan) {
		this.kd_jurusan = kd_jurusan;
	}
	public String getNm_jurusan() {
		return nm_jurusan;
	}
	public void setNm_jurusan(String nm_jurusan) {
		this.nm_jurusan = nm_jurusan;
	}
	public String getKd_fakultas() {
		return kd_fakultas;
	}
	public void setKd_fakultas(String kd_fakultas) {
		this.kd_fakultas = kd_fakultas;
	}
	public int getSpp() {
		return spp;
	}
	public void setSpp(int spp) {
		this.spp = spp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
