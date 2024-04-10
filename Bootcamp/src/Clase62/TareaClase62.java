package Clase62;

import java.util.Scanner;

public class TareaClase62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        
	        // Solicitar al usuario que ingrese un número
	        System.out.print("Ingresa un número: ");
	        int numero = scanner.nextInt();

	        // Sentencia condicional para verificar si un número es positivo
	        if (numero > 0) {
	            System.out.println("El número es positivo.");
	        } else if (numero == 0) {
	            System.out.println("El número es cero.");
	        } else {
	            System.out.println("El número es negativo.");
	        }

	        // Sentencia condicional para verificar si un número es par o impar
	        System.out.print("Ingresa otro número: ");
	        int otroNumero = scanner.nextInt();
	        if (otroNumero == 0) {
	            System.out.println("El número es cero.");
	        } else if (otroNumero % 2 == 0) {
	            System.out.println("El número es par.");
	        } else {
	            System.out.println("El número es impar.");
	        }

	        scanner.close();
	    }
	}