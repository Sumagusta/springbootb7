package com.kodehive.springbootb7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kodehive.springbootb7.model.MahasiswaModel;

@Repository
public interface MahasiswaRepository extends JpaRepository<MahasiswaModel, Integer>{ // T = Nama Table | ID = Tipe Data Primary Key

	// contoh custome query
	@Query("select m from MahasiswaModel m where m.status = ?1")
	MahasiswaModel cariStatusMahasiswa(String status);
}
