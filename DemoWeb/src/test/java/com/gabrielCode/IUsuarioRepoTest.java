package com.gabrielCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gabrielCode.model.Usuario;
import com.gabrielCode.repo.IUsuarioRepo;

    @SpringBootTest
    class IUsuarioRepoTest {
    @Autowired
    private IUsuarioRepo usuRepo;
    
	@Test
	void testAgregar() {
		Usuario usu = new Usuario(0,"Gabriel", "gcasas");
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals(usu.getClave(), usuRetorno.getClave());
	}

}
