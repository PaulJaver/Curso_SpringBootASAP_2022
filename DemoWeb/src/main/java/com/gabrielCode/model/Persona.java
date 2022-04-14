package com.gabrielCode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity (name = "personas")
    public class Persona {
    //atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    
	@Column(name ="PER_ID")
	private int codigo;
	@Column(name = "PER_NOMBRE", length = 50)
	private String nombre;
	
	//constructores
	public Persona() {}
	public Persona(int pCod, String pNom) {
		codigo = pCod;
		nombre = pNom;
	}
	
	
	//accesors
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
