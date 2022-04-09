package com.domain.modelo.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.domain.modelo.Alumno;
import com.domain.modelo.dao.AlumnoDAO;

class AlumnoDAOTest {
    AlumnoDAO aluDao;
    Alumno    alumno;
	
	@BeforeEach
	void setUp() throws Exception {
		aluDao = new AlumnoDAO();
		alumno = new Alumno(0, "Pablo_test", "Alonso_test", "pepoalonso@gmail.test", "universitarios_test", "https://github.com/PaulJaver/Curso_SpringBootASAP_2022");
	}

	@AfterEach
	void tearDown() throws Exception {
		aluDao = null;
		alumno = null;
	}

	@Test
	void testAgregar() {
		try {
			aluDao.agregar(alumno);
			assertTrue(true);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			assertTrue(false);
		} catch (SQLException e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

}
