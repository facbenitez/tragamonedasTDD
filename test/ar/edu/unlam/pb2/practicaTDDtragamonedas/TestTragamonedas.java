package ar.edu.unlam.pb2.practicaTDDtragamonedas;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.Tragamonedas.Tambores;
import ar.edu.unlam.pb2.Tragamonedas.Tragamonedas;

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
	
	@Test
	public void testQuePermitaCrearUnTragamoneda() {
		Tambores tambor1=new Tambores(6);
		Tambores tambor2=new Tambores(6);
		Tambores tambor3=new Tambores(6);
		
		Tragamonedas tragamoneda=new Tragamonedas(tambor1,tambor2,tambor3);
		
		assertNotNull(tragamoneda);
		
	}


}
