package com.idat.Evaluacion01.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String curso;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(
			name = "id_malla",
			nullable = false,
			unique = true,
			foreignKey = @javax.persistence.ForeignKey(foreignKeyDefinition = "foreign key (id_malla) references Mallas(id_malla)")
			)
	private MallaCurricular malla;
	
	@ManyToMany(mappedBy = "cursos", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Profesor> profesores = new ArrayList<>();
	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
