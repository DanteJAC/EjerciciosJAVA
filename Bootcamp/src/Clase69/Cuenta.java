package Clase69;

public class Cuenta {

	// Atributos
		private int numCuenta;
		private String titular;
		private double saldo;
		
		// Constructor
		public Cuenta(int numCuenta, String titular, double saldoInicial) {
			this.numCuenta = numCuenta;
			this.titular = titular;
			this.saldo = saldoInicial;
		}
		
		// Método para mostrar los datos de la cuenta
		public void mostrarDatos() {
			System.out.println("Número de cuenta: " + numCuenta);
			System.out.println("Titular: " + titular);
			System.out.println("Saldo: $" + saldo);
		}
		
		public static void main(String[] args) {
			// Crear un objeto billetera
			Cuenta billetera = new Cuenta(35974, "Jacobo Escalona", 2000.0);

			// Mostrar los datos de billetera1
			billetera.mostrarDatos();
		}
	
		
	
	
	
}
