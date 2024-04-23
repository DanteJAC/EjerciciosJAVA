package Clase80;

class TarjetaDeCredito implements FormaDePago {

	@Override
    public void procesarPago(double monto) {
        System.out.println("Tarjeta de crédito: $" + monto);
    }
}
