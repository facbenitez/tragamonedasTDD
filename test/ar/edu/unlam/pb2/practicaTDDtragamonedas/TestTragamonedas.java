package ar.edu.unlam.pb2.practicaTDDtragamonedas;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.Tragamonedas.Tambores;

public class TestTragamonedas {

	@Test
	public void testQueSeCreeTamborConCantidadDeCaras() {
		Integer caras=3;
		Tambores tambor1=new Tambores(caras);
		
		assertNotNull(tambor1);
		
	}
	
	@Test      
	public void testQueTamborCreeValorConCantidadDeCaras() {
		Integer caras=3;
		Tambores tambor1=new Tambores(caras);
		Integer minimo=1;
		Integer maximo=3;
		
		tambor1.girar();
		Integer valorObtenido=tambor1.mostrarValor();
		
		assertTrue("El valor esta entre 1 y 3", valorObtenido>=minimo && valorObtenido<=maximo);
		
	}

}
