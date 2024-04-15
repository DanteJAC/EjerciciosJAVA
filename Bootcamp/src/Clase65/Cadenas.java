package Clase65;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Tarea 1: Extraer la cuarta y quinta letra de una cadena
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        if (cadena.length() >= 5) {
            String cuartaQuintaLetra = cadena.substring(3, 5);
            System.out.println("La cuarta y quinta letra de la cadena son: " + cuartaQuintaLetra);
        } else {
            System.out.println("La cadena ingresada debe tenre al menos 5 caracteres.");
        }

        // Tarea 2: Contar la cantidad de vocales en una cadena
        int cantidadVocales = contarVocales(cadena);
        System.out.println("La cantidad de vocales en la cadena es: " + cantidadVocales);

        scanner.close();
    }

    // Método para contar la cantidad de vocales en una cadena
    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase(); // Convertir la cadena a minúsculas para simplificar la comparación

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        return contador;
    }
}