package Clase65;

import java.util.Scanner;

public class Clase65A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa 8 caracteres: ");
        
        String input = scanner.nextLine();
        
        if (input.length() == 8) {
            System.out.println("CORRECTO");
            System.out.println(input.toUpperCase());
        } else {
            System.out.println("INCORRECTO");
            System.out.println(input.toLowerCase());
            
            scanner.close();
        }
	}

}
