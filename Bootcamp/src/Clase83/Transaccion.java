package Clase83;

public class Transaccion {
	 private String origen;
	 private String destino;
	 private double monto;
	 // Constructor
	 public Transaccion(String origen, String destino, double monto) {
	     this.origen = origen;
	     this.destino = destino;
	     this.monto = monto;
	 }
	 // Método para realizar la transacción
	 public void realizar() {
	     // Lógica para transferir el monto entre cuentas
	     System.out.println("Transacción realizada: $" + monto + " de " + origen + " a " + destino);
	 }
	}
