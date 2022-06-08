package com.idat.Evaluacion01.service;

import java.util.List;

import com.idat.Evaluacion01.model.MallaCurricular;

public interface MallaService {
	
	void guardarMalla(MallaCurricular malla);
	void actualizarMalla(MallaCurricular malla);
	void eliminarMalla(Integer id);
	List<MallaCurricular> listarMalla();
	MallaCurricular obtenerMallaId(Integer id);

}
