package Clase73;

public class Cuenta {

	private int numeroCuenta;
    private double saldo;
	
 // Constructor
    public Cuenta(int numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    
 // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            var montoFinal =saldo + monto;
            System.out.println("Depósito exitoso. Saldo anteriro: $"+ saldo +" Su nuevo saldo es de: $" + montoFinal);
            
            saldo= montoFinal;
        } else {
            System.out.println("ERROR, el monto debe ser mayor que cero.");
        }
    }
    
    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
        	 var montoFinal =saldo - monto;
            System.out.println("Retiro exitoso. Saldo anterior: $"+ saldo +" Su nuevo saldo es de: $" + montoFinal);
            
            saldo= montoFinal;
        } else {
            System.out.println("ERROR, monto inválido o saldo insuficiente.");
        }
    }
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
    
}


    

