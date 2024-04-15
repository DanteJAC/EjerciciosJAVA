package Clase67;

import java.util.Scanner;

public class Clase67A {
	
	//Ejemplo buenas practicas
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edadUsuario = scanner.nextInt();

        System.out.println("Datos ingresados:");
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Edad: " + edadUsuario);
        
        
        
        
        
        scanner.close();
	}

}
