package PrimerasClases;

public class ManejaPuntos {

	public static void main(String[] args) {
		//Sirve para ver si he pensado bien la clase Punto 
		Punto primerPunto; //Declaro un objeto de la clase Punto 
		primerPunto= new Punto(2,3);//Uso un constructor para inicializar
		System.out.print("Este punto dista del origen: ");
		System.out.print(primerPunto.devuelveDistanciaOrigen());
	}
}
