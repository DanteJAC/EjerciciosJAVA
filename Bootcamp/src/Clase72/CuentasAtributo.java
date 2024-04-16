package Clase72;

import java.util.Scanner;

public class CuentasAtributo {

	private int numeroCuenta;
    private String nombre;
    private double saldo;
	
 // CONSTRUCTOR POR DEFECTO
    public CuentasAtributo() {
        this.numeroCuenta = 0;
        this.nombre = "";
        this.saldo = 0.0;
    }
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
		// METODO ASIGNAR VALOR CUENTA
	    // EL METODO VOID NO RETORNA NIGÚN VALOR
		public void Cuenta() { 
		// NÚMERO DE CUENTA
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Ingrese el número de cuenta: ");
	     int numeroCuenta = scanner.nextInt();        
	     scanner.nextLine();
	     setNumeroCuenta(numeroCuenta);
	     // NOMBRE
	     System.out.print("Ingrese el nombre del titular: ");
	     String nombre = scanner.nextLine();
	     setNombre(nombre);
	     // SALDO
	     System.out.print("Ingrese el saldo inicial: ");
	     double saldo = scanner.nextDouble();
	     setSaldo(saldo);
	     
	     scanner.close();
		}
}
