package Clase80;

class PayPal implements FormaDePago {

	@Override
    public void procesarPago(double monto) {
        System.out.println("PayPal: $" + monto);
    }
}
