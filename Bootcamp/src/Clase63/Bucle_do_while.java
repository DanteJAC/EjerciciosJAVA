package Clase63;

import java.util.Scanner;

public class Bucle_do_while {
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el límite del rango para sumar los números (debe estar entre 1 y 10): ");
    int limite = scanner.nextInt();

    // Validar que el límite esté dentro del rango permitido
    if (limite < 1 || limite > 10) {
        System.out.println("El límite superior debe estar entre 1 y 10.");
    } else {
        int numero = 1;
        int suma = 0;

        // Bucle do-while para sumar los números del 1 al límite 
        do {
            suma += numero;
            numero++;
        } while (numero <= limite);

        // Mostrar el resultado de la suma
        System.out.println("La suma de los números del 1 al " + limite + " es: " + suma);
    }

    scanner.close();
}
}