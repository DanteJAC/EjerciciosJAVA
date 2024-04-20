package Clase78;
// Clase abstracta 
public abstract class CuentaDigital {

	private String titular;
	private double saldo;
	/**
	 * @param titular
	 * @param saldo
	 */
	public CuentaDigital(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		
	}
	
	
	// Método abstracto para verificar fondos (debe ser implementado por las subclases)
	 public abstract boolean verificarFondos();
	 /**
		 * @return the titular
		 */
		public String getTitular() {
			return titular;
		}
		/**
		 * @return the saldo
		 */
		public double getSaldo() {
			return saldo;
}
}