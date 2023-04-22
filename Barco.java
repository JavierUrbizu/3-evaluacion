package EJERCICIOS;

public class Barco {
	//Atributos 
	private String nombreBarco;
	private int tamano;
	private int NumeroPalos;
	//constructor 
	public Barco(String nombreBarco, int tamano, int numeroPalos) {
		super();
		this.nombreBarco = nombreBarco;
		this.tamano = tamano;
		NumeroPalos = numeroPalos;
	}
	//ejemplo de polimorfimso: sobrecargar el constructor 
	public Barco(String nombreBarco) {
		super();
		this.nombreBarco = nombreBarco;
}
	public String getNombreBarco() {
		return nombreBarco;
	}
	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	public int getNumeroPalos() {
		return NumeroPalos;
	}
	public void setNumeroPalos(int numeroPalos) {
		NumeroPalos = numeroPalos;
	}
}