package Clase62;

import java.util.Scanner;

public class Clase62B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 12: ");
        int numeroMes = scanner.nextInt();
        String mes = "";
      
       
        
        switch (numeroMes) {
        case 1:
            mes = "Enero";
            break;
        case 2:
            mes = "Febrero";
            break;
        case 3:
            mes = "Marzo";
            break;
        case 4:
            mes = "Abril";
            break;
        case 5:
            mes = "Mayo";
            break;
        case 6:
            mes = "Junio";
            break;
        case 7:
            mes = "Julio";
            break;
        case 8:
            mes = "Agosto";
            break;
        case 9:
            mes = "Septiembre";
            break;
        case 10:
            mes = "Octubre";
            break;
        case 11:
            mes = "Noviembre";
            break;
        case 12:
            mes = "Diciembre";
            break;
        default:
            System.out.println("Número inválido. Ingresa un valor entre 1 y 12.");
            return; // Sale del programa. 
                

        }scanner.close();
   	 
       
	}

} 
