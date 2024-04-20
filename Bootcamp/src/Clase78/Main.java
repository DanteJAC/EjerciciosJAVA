package Clase78;

public class Main {
	public static void main(String[] args) {
        // Crear una cuenta en pesos chilenos
        CuentaCL CuentaCL = new CuentaCL("Carlos M", 2000000.0);
        System.out.println("Titular: " + CuentaCL.getTitular());
        System.out.println("Saldo en pesos chilenos: $" + CuentaCL.getSaldo());
        System.out.println("¿Tiene fondos suficientes? " + CuentaCL.verificarFondos());
// Crear una cuenta en dólares
        CuentaUSD CuentaUSD = new CuentaUSD("Leo Gómez", 3000.0);
        System.out.println("Titular: " + CuentaUSD.getTitular());
        System.out.println("Saldo en dólares: $" + CuentaUSD.getSaldo());
        System.out.println("¿Tiene fondos suficientes? " + CuentaUSD.verificarFondos());
    }
}