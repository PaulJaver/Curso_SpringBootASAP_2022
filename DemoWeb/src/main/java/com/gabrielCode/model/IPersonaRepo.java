package com.gabrielCode.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielCode.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

	
	
}
