package Clase79;

public class Main {
	
	
	public static void main(String[] args) {
	Moneda dolar = new Dolar();
	   Moneda euro = new Euro();
	   double cantidadEnDolares = 100.0;
	           double cantidadEnEuros = dolar.convertir(cantidadEnDolares, euro);

	           System.out.println(cantidadEnDolares + " dólares = " + cantidadEnEuros + " euros");
	}
}