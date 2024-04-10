package Clase64;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

		// Declarar el arreglo para almacenar 3 números enteros
	        int[] numeros = new int[3];

	        // Recorrer el arreglo y pedir al usuario que ingrese cada número
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingrese el número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Encontrar el mayor elemento en el arreglo
	        int mayor = numeros[0];
	        for (int i = 1; i < numeros.length; i++) {
	            if (numeros[i] > mayor) {
	                mayor = numeros[i];
	            }
	        }

	        // Mostrar el mayor elemento
	        System.out.println("El mayor elemento ingresado es: " + mayor);

	        scanner.close();
	    }
	}
