package Clase73;

import java.util.Scanner;

public class Cliente {

	private long ID;
    private String nombre;
    private Cuenta cuenta;
 // Constructor
    public Cliente(long ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }
 // Método para crear una cuenta
    public void crearCuenta(int numeroCuenta, double saldoInicial) {
        cuenta = new Cuenta(numeroCuenta, saldoInicial);
    }
 // Método para crear deposito
    public void deposito(double monto) {
        cuenta.depositar(monto);
    }
 // Método para retirar
    public void retirar(double saldoInicial) {
        cuenta.retirar(saldoInicial);
    }
 // Método para consultar Datos
    public void consultarDatos() {
        System.out.println("Datos del cliente:");
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Datos de la cuenta:");
        cuenta.mostrarInformacion();
    }
public static void main(String[] args) { 
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.print("Ingrese el ID del cliente: ");
    long idCliente = scanner.nextLong();
    scanner.nextLine(); // Consumir el salto de línea
    System.out.print("Ingrese el nombre del cliente: ");
    String nombreCliente = scanner.nextLine();
    
    Cliente cliente = new Cliente(idCliente, nombreCliente);
   
    System.out.print("Ingrese el número de cuenta: ");
    int numeroCuenta = scanner.nextInt();
    System.out.print("Ingrese el saldo inicial: ");
    double saldoInicial = scanner.nextDouble();
    
    System.out.print("Que quiere hacer (1- Depositar - 2 Retirar)");
    var accion = scanner.nextLong();
     cliente.crearCuenta(numeroCuenta, saldoInicial);
     
     if (accion ==1) {
         System.out.print("Ingrese Monto a depositar: ");
         var monto = scanner.nextLong();
         cliente.deposito(monto);	
     }else {
         System.out.print("Ingrese Monto a retirar: ");
         var monto = scanner.nextLong();
         cliente.retirar(monto);	
     }
     
     cliente.consultarDatos();
     
    scanner.close();
	}
}
