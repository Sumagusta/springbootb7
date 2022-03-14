package com.kodehive.springbootb7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class MahasiswaModel {

	// property
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NO_MAHASISWA")
	private int no_mhs;

	@Column(name = "Nama_Mahasiswa")
	private String nm_mhs;
	private String jk;
	private String alamat;
	private String status;

	private String kd_jurusan; // yang membutuhkan data dari tabel lain, maka bisa menambahkan kolom untuk foreign key

	public String getKd_jurusan() {
		return kd_jurusan;
	}
	
	@ManyToOne
	@JoinColumn(name="kd_jurusan", nullable = true, insertable = false, updatable = false)
	private JurusanModel jurusanModel;
	

	public JurusanModel getJurusanModel() {
		return jurusanModel;
	}

	public void setJurusanModel(JurusanModel jurusanModel) {
		this.jurusanModel = jurusanModel;
	}

	public void setKd_jurusan(String kd_jurusan) {
		this.kd_jurusan = kd_jurusan;
	}

	public int getNo_mhs() {
		return no_mhs;
	}

	public void setNo_mhs(int no_mhs) {
		this.no_mhs = no_mhs;
	}

	public String getNm_mhs() {
		return nm_mhs;
	}

	public void setNm_mhs(String nm_mhs) {
		this.nm_mhs = nm_mhs;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// Buat Model Skripsi
	// Auto Incerent PK

	// Int id
	// String nama_skripsi
	// int tahun
	// int nilai


	

}
