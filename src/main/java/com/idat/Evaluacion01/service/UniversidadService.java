package com.idat.Evaluacion01.service;

import java.util.List;

import com.idat.Evaluacion01.model.Universidad;

public interface UniversidadService {
	
	void guardarUniversidad(Universidad universidad);
	void actualizarUniversidad(Universidad universidad);
	void eliminarUniversidad(Integer id);
	List<Universidad> listarUniversidado();
	Universidad obtenerUniversidadId(Integer id);

}
