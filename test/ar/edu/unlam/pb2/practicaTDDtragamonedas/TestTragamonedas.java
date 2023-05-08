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

}
