package PrimerasClases;

public class Punto {
	//atributos=variables
	private int coordX;
	private int coordY;
	
	//constructor (mismo nombre que la clase)-> para reservar memoria 
	public Punto(int nuevaCoordX,int nuevaCoordY){
		coordX= nuevaCoordX;
		coordY= nuevaCoordY;
	}	
	//métodos
	double devuelveDistanciaOrigen(){
		double distancia; //double es como float pero mas preciso 
		distancia = Math.sqrt(coordX*coordX+coordY*coordY); //sqrt es raíz cuadrada
		return(distancia);
	}
	//métodos setter&getter --> en source te los crea solos
	//metodo set: fijar el valor del atributo 
	public int getCoordX() {
		return coordX;
	}
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
		
}
