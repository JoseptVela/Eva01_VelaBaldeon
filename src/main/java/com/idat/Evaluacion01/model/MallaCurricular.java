package com.idat.Evaluacion01.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mallas")
public class MallaCurricular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private Integer anio;
	
	@OneToOne
	@JoinColumn(
			name = "id_universidad", 
			nullable = false, 
			unique = true, 
			foreignKey = @javax.persistence.ForeignKey(foreignKeyDefinition = "foreign key (id_universidad) references Universidades(id_universidad)")
			)
	private Universidad universidad;
	
	@OneToMany(mappedBy = "malla")
	private List<Curso> cursos = new ArrayList<>();
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	
	

}
