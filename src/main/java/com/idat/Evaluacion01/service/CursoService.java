package com.idat.Evaluacion01.service;

import java.util.List;

import com.idat.Evaluacion01.model.Curso;

public interface CursoService {

	void guardarCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);
	List<Curso> listarCurso();
	Curso obtenerCursoId(Integer id);
	
}
