package ar.edu.unlam.pb2.practicaTDDtragamonedas;

public class Tragamonedas {
	private Tambores tambor1;
	private Tambores tambor2;
	private Tambores tambor3;
	
	public Tragamonedas(Tambores tambor1,Tambores tambor2,Tambores tambor3) {
		this.tambor1=tambor1;
		this.tambor2=tambor2;
		this.tambor3=tambor3;
	}
	
	public void activar() {
		this.tambor1.girar();
		this.tambor2.girar();
		this.tambor3.girar();
	}
	
	public Boolean entregarPremio() {
		if(tambor1.mostrarValor().equals(tambor2.mostrarValor().equals(tambor3.mostrarValor()))) {
			
	    return true;
		}
		return false;
	}


}
