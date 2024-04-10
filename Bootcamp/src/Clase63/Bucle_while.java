package Clase63;

import java.util.Scanner;

public class Bucle_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese el límite del rango para sumar los números (mayor que 0 y no mayor que 10): ");
		        int limite = scanner.nextInt();

		        // Validar que el límite  esté dentro del rango permitido
		        if (limite <= 0 || limite > 10) {
		            System.out.println("El límite debe estar entre 1 y 10.");
		        } else {
		            int numero = 1;
		            int suma = 0;

		            // Bucle while para sumar los números del 1 al límite 
		            while (numero <= limite) {
		                suma += numero;
		                numero++;
		            }

		            // Mostrar el resultado de la suma
		            System.out.println("La suma de los números del 1 al " + limite + " es: " + suma);
		        }

		        scanner.close();
		    }
}

