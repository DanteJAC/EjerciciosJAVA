package Clase84;

public class Main {
	
	public static void main(String[] args) {
		
		Wallet myWallet = new Wallet();

        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod debitCard = new DebitCardPayment();
        PaymentMethod payPal = new PayPalPayment();

        myWallet.processPayment(creditCard, 100);
        myWallet.processPayment(debitCard, 50);
        myWallet.processPayment(payPal, 200);
	}
}
