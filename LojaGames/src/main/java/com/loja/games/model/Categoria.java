package com.loja.games.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull; 
import javax.persistence.*;

@Entity
@Table(name = "categoria")  
public class Categoria {  
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String genero;
	
	@NotNull
	@Size(min = 10, max = 500)
	private String tipo;

	
	/*@ManyToOne
	@JsonIgnoreProperties("categoria")
	private
	*/
	
	//Getters and Setters ;)
	public long getId() {
		return id;
	} 

	public void setId(long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	

}
	