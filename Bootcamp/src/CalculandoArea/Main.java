package CalculandoArea;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("------------------------------");
        	System.out.println("            Menú:");
        	System.out.println("------------------------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Triángulo");
            System.out.println("2. Círculo");
            System.out.println("3. Rectángulo");
            System.out.println("4. Salir");
            System.out.println("------------------------------");

            int opcion = scanner.nextInt();
            if (opcion == 4) {
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la base del triángulo:");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("------------------------------");
                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    System.out.println("------------------------------");
                    break;
                case 2:
                    System.out.println("Ingrese el radio del círculo:");
                    double radioCirculo = scanner.nextDouble();
                    System.out.println("Valor de Pi ya determinado");
                    Circulo circulo = new Circulo(Math.PI, radioCirculo);
                    System.out.println("------------------------------");
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("------------------------------");
                    break;
                case 3:
                    System.out.println("Ingrese la base del rectángulo:");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double alturaRectangulo = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("------------------------------");
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("------------------------------");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        }
        


        scanner.close();
 }
}


