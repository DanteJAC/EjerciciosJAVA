package Clase66;

import java.util.Scanner;

public class Clase66A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Ingresar longitud del radio de la esfera: ");
        double radio = scanner.nextDouble();
double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3); 

        System.out.println("El volumen de " + radio + " es: " + volumen);
        
        
        
        
        scanner.close();

	}

}
