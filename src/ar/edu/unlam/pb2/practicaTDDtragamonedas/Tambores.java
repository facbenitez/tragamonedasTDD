package ar.edu.unlam.pb2.practicaTDDtragamonedas;

public class Tambores {
	private Integer valor;
	private Integer caras;
	
	public Tambores(Integer caras) {
		this.caras=caras;
		this.valor=girar();
		
	}
	
	public Integer girar() {
		return this.valor=(int)(Math.random()*this.caras)+1;
	}
	
	public Integer mostrarValor() {
		return this.valor;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Integer getCaras() {
		return caras;
	}

	public void setCaras(Integer caras) {
		this.caras = caras;
	}

}
