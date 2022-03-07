package com.kodehive.springbootb7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PasienModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nomor_pasien")
	private int no_pasien;
	private String nm_pasien;
	private String jk_pasien;
	private String kls_pasien;
	private int cost_pasien;
	
	
	public int getNo_pasien() {
		return no_pasien;
	}
	public void setNo_pasien(int no_pasien) {
		this.no_pasien = no_pasien;
	}
	public String getNm_pasien() {
		return nm_pasien;
	}
	public void setNm_pasien(String nm_pasien) {
		this.nm_pasien = nm_pasien;
	}
	public String getJk_pasien() {
		return jk_pasien;
	}
	public void setJk_pasien(String jk_pasien) {
		this.jk_pasien = jk_pasien;
	}
	public String getKls_pasien() {
		return kls_pasien;
	}
	public void setKls_pasien(String kls_pasien) {
		this.kls_pasien = kls_pasien;
	}
	public int getCost_pasien() {
		return cost_pasien;
	}
	public void setCost_pasien(int cost_pasien) {
		this.cost_pasien = cost_pasien;
	}


}
