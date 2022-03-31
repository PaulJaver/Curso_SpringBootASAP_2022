package ar.edu.asap.practica1.modelo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.asap.practica1.modelo.Papel;
import ar.edu.asap.practica1.modelo.Piedra;
import ar.edu.asap.practica1.modelo.PiedraPapelTijeraFactory;
import ar.edu.asap.practica1.modelo.Tijera;

class PiedraPapelTijeraFactoryTest {
//lote de pruebas
	Piedra piedra;
	Papel papel;
	Tijera tijera;
	
	@BeforeEach
	void setUp() throws Exception {
		//se ejecuta antes de cada test
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}

	@AfterEach
	void tearDown() throws Exception {
		//se ejecuta despues de cada test
		piedra = null;
		papel = null;
		tijera = null;
	}


	@Test
	void testPiedraPierdeConPapel_comparar(){
		assertEquals(-1, piedra.comparar(papel));
	}
	
	@Test
	void testPiedraPierdeConPapel_comparar_DescripcionResultado() {
		int result=piedra.comparar(papel);
		assertEquals("piedra pierde contra papel", piedra.getDescripcionResultado());
	}
	
	
	@Test
	void testPiedraEmpataConPiedra_comparar() {
		assertEquals(0, piedra.comparar(piedra));
	}
	
	@Test
	void testPiedraEmpataConPiedra_comparar_DescripcionResultado() {
		int result=piedra.comparar(piedra);
		assertEquals("piedra empata con piedra", piedra.getDescripcionResultado());
	}
	
	
	
	@Test
	void testPiedraGanaATijera_comparar(){
		assertEquals(1, piedra.comparar(tijera));
	}
	
	@Test
	void testPiedraGanaATijera_comparar_DescripcionResultado() {
		int result=piedra.comparar(tijera);
		assertEquals("piedra le gana a tijera", piedra.getDescripcionResultado());
	}
	
	@Test
	void testGetInstance_piedra() {
		assertEquals("piedra", PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA)
		.getNombre());
	}
	
	//papel con todos 
	//tijera con todos
}
