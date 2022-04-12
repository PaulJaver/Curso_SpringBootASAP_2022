package com.gabrielCode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.gabrielCode.repository.IPersona;
import com.gabrielCode.repository.PersonaRepoImpl1;

@Service

public class PersonaServiceImpl implements IpersonaService{
	@Autowired
	@Qualifier("persona1")
    IPersona repo;
	@Override
    public void registrarHandler(String pNombre) {
		//repo = new PersonaRepoImpl1()
	    repo.registrar(pNombre);
    }
   
}
