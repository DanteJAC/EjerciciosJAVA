package Clase62;

import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número de mes
        System.out.print("Ingrese un número de mes (1-12): ");
        int mes = scanner.nextInt();

        // Variables para almacenar el nombre del mes y la estación del año
        String nombreMes = "";
        String estacion = "";

        // Utilizar un switch para determinar el nombre del mes y la estación del año
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                estacion = "Invierno";
                break;
            case 2:
                nombreMes = "Febrero";
                estacion = "Invierno";
                break;
            case 3:
                nombreMes = "Marzo";
                estacion = "Primavera";
                break;
            case 4:
                nombreMes = "Abril";
                estacion = "Primavera";
                break;
            case 5:
                nombreMes = "Mayo";
                estacion = "Primavera";
                break;
            case 6:
                nombreMes = "Junio";
                estacion = "Verano";
                break;
            case 7:
                nombreMes = "Julio";
                estacion = "Verano";
                break;
            case 8:
                nombreMes = "Agosto";
                estacion = "Verano";
                break;
            case 9:
                nombreMes = "Septiembre";
                estacion = "Otoño";
                break;
            case 10:
                nombreMes = "Octubre";
                estacion = "Otoño";
                break;
            case 11:
                nombreMes = "Noviembre";
                estacion = "Otoño";
                break;
            case 12:
                nombreMes = "Diciembre";
                estacion = "Invierno";
                break;
            default:
                System.out.println("Número de mes inválido. Por favor, ingrese un número entre 1 y 12.");
        }

        // Mostrar el nombre del mes y la estación del año
        if (!nombreMes.equals("") && !estacion.equals("")) {
            System.out.println("El mes es " + nombreMes + " y la estación del año es " + estacion + ".");
        }

        scanner.close();
    }
}
