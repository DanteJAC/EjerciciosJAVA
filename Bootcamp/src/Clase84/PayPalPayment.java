package Clase84;

public class PayPalPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
		
		System.out.println("Pago con PayPal: $" + amount);
	}

}
