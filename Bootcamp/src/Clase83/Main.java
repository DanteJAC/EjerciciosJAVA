package Clase83;

public class Main {

	//Metodo ejecutor
	public static void main(String[] args) {
	
	CuentaBancaria miCuenta = new CuentaBancaria(1000);

	//Metodo Deposito Valor agregado
	   miCuenta.realizarDeposito(200);
	//Metodo retiro Valor agregado
	   miCuenta.realizarRetiro(150);
	  
	   Transaccion miTransaccion = new Transaccion("CuentaA", "CuentaB", 50);
       miTransaccion.realizar();
}

}