package com.gabrielCode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielCode.model.Persona;
import com.gabrielCode.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
     @Autowired
     private IPersonaRepo repo;
     
     @GetMapping("/personas")
     public List<Persona> listar(){
    	 return repo.findAll();
     }
     
     @PostMapping
     public void insertar(Persona per) {
    	 repo.save(per);
     }
     
     @DeleteMapping(value = "/{id}")
 	public void eliminar(@PathVariable("id") Integer id) {
 		repo.deleteById(id);
 	}
}
