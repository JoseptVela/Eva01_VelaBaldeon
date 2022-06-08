package com.idat.Evaluacion01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Evaluacion01.model.MallaCurricular;

@Repository
public interface MallaRepository extends JpaRepository<MallaCurricular,Integer>{

}
