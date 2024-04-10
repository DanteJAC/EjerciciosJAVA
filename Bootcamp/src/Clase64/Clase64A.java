package Clase64;

import java.util.Scanner;

public class Clase64A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String[] paises = new String[5];
		for (int i = 0; i < paises.length; i++) {
		            System.out.print("Ingresa el nombre del país " + (i + 1) + ": ");
		            paises[i] = scanner.nextLine();
		 } 
		            System.out.println("\nLos países ingresados son:");
		            for (String pais : paises) {
		                System.out.println(pais);
		           
		        }
	}

}
