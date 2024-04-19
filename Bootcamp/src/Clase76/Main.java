package Clase76;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billetera billetera = new Billetera();
		
		TarjetaDeCredito tarjeta = new TarjetaDeCredito(12);
			billetera.setMetodoPago(tarjeta);
			billetera.realizarPago("Pago con tarjeta de crédito");
			
			 System.out.println("Cantidad de cuotas: " + tarjeta.getCantidadCuotas());
			 
			 Moneda moneda = new Moneda("USD");
		        billetera.setMetodoPago(moneda);
		        billetera.realizarPago("Realiza el pago en dólares");
		        System.out.println("Tipo de moneda: " + moneda.getTipoMoneda());
	}

}
