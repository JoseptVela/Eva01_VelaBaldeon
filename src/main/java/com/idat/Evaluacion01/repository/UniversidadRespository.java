package com.idat.Evaluacion01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Evaluacion01.model.Universidad;

@Repository
public interface UniversidadRespository  extends JpaRepository<Universidad,Integer>{

}
