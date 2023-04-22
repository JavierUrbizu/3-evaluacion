package EJERCICIOS;

public class ManejaBarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barco miPrimerBarquito, miSegundoBarquito;
		Barco miBarquitoBebe;
		miPrimerBarquito= new Barco("velero", 12, 2);
		miSegundoBarquito= new Barco("bergantín", 57, 5);
		System.out.println(miPrimerBarquito.getNombreBarco());
		System.out.println(miSegundoBarquito.getNombreBarco());
		miBarquitoBebe= new BarcoVelasCuadradas("trireme", 10, 1, true);
		System.out.println(miBarquitoBebe.getNombreBarco());
	}

}
