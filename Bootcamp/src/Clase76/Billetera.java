package Clase76;

class Billetera{ 
	
	//Método
	private FormaDePago metodoPago;

	// Setter para asignar el método de pago
		public void setMetodoPago(FormaDePago metodoPago) {
		this.metodoPago = metodoPago;
	}
	// Método para realizar el pago utilizando polimorfismo
		public void realizarPago(String mensaje) {
		     metodoPago.realizarPago(mensaje);
		 }	
	
	
	
}
