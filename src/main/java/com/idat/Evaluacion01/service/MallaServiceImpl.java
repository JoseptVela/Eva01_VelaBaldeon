package com.idat.Evaluacion01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Evaluacion01.model.MallaCurricular;
import com.idat.Evaluacion01.repository.MallaRepository;

@Service
public class MallaServiceImpl implements MallaService{
	
	@Autowired
	private MallaRepository repository;

	@Override
	public void guardarMalla(MallaCurricular malla) {
		repository.save(malla);
	}

	@Override
	public void actualizarMalla(MallaCurricular malla) {
		repository.saveAndFlush(malla);
	}

	@Override
	public void eliminarMalla(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<MallaCurricular> listarMalla() {
		return repository.findAll();
	}

	@Override
	public MallaCurricular obtenerMallaId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
