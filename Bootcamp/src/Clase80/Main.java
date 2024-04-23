package Clase80;

public class Main {

	
	    public static void main(String[] args) {
	        double montoCompra = 150.0;

	        // Diferentes formas de pago
	        FormaDePago tarjeta = new TarjetaDeCredito();
	        FormaDePago paypal = new PayPal();
	        FormaDePago efectivo = new Efectivo();

	        // Realizar pagos utilizando polimorfismo
	        tarjeta.procesarPago(montoCompra);
	        paypal.procesarPago(montoCompra);
	        efectivo.procesarPago(montoCompra);
	    }
	}
