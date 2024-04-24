package Clase84;

public class Wallet {

	public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
