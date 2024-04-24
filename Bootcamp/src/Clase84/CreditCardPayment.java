package Clase84;

public class CreditCardPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
		
		System.out.println("Pago con tarjeta de crédito: $" + amount);
	}

}
