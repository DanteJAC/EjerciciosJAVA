package Clase62;

import java.util.Scanner;

public class Clase62A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu edad: ");
		int edad = scanner.nextInt();
		
		if (edad > 18) {
            System.out.println("Tienes " + edad + " años.");
        } else if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Tienes 18 años actualmente.");
        }
	
	
	
	}
}
