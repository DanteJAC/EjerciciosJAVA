package Clase84;

public class DebitCardPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Pago con tarjeta de débito: $" + amount);

	}

}
