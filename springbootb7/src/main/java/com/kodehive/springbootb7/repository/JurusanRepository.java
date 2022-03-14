package com.kodehive.springbootb7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodehive.springbootb7.model.JurusanModel;

@Repository
public interface JurusanRepository extends JpaRepository<JurusanModel, String> {

}
