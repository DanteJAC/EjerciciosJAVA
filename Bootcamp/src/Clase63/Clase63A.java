package Clase63;

import java.util.Scanner;

public class Clase63A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int numeroIngresado;

        System.out.println("Ingresa su números (0 para salir):");
		
        do {
            System.out.print("Número: ");
            numeroIngresado = scanner.nextInt();
          
            System.out.println("Número es: " + numeroIngresado);
        } 
        while (numeroIngresado != 0);

        System.out.println("Fin del programa");
        
        scanner.close();
	}
	
	 
}
