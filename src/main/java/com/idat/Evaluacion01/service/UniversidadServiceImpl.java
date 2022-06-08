package com.idat.Evaluacion01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Evaluacion01.model.Universidad;
import com.idat.Evaluacion01.repository.UniversidadRespository;

@Service
public class UniversidadServiceImpl implements UniversidadService{
	
	@Autowired
	private UniversidadRespository repository;

	@Override
	public void guardarUniversidad(Universidad universidad) {
		repository.save(universidad);
	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		repository.saveAndFlush(universidad);
	}

	@Override
	public void eliminarUniversidad(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Universidad> listarUniversidado() {
		return repository.findAll();
	}

	@Override
	public Universidad obtenerUniversidadId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
