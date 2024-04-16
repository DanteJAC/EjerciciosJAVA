package Clase71;

public class CuentaBancaria {
    private double saldoActual;

    public CuentaBancaria(double saldoInicial) {
        this.saldoActual = saldoInicial;
    }

    public void ingresarDinero(double monto) {
        if (monto > 0) {
            saldoActual += monto;
            System.out.println("Se han ingresado $" + monto + ". Saldo actual: $" + saldoActual);
        } else {
            System.out.println("El monto ingresado debe ser mayor que cero.");
        }
    }

    public double obtenerSaldo() {
        return saldoActual;
    }

    // Getter para saldoActual
    public double getSaldoActual() {
        return saldoActual;
    }

    // Setter para saldoActual
    public void setSaldoActual(double nuevoSaldo) {
        this.saldoActual = nuevoSaldo;
    }

    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria(1000);
        miCuenta.ingresarDinero(500);  // Ingresa $500
        miCuenta.ingresarDinero(-200); // Intenta ingresar un monto negativo
        System.out.println("Saldo final: $" + miCuenta.obtenerSaldo());
    }
}
