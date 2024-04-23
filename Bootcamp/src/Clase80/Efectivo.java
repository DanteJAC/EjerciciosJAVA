package Clase80;

class Efectivo implements FormaDePago {

	
	@Override
    public void procesarPago(double monto) {
        System.out.println("Pagando en efectivo: $" + monto);
	}
	
}
