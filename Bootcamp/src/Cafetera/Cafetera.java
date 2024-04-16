package Cafetera;

import java.util.Scanner;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    private Scanner scanner;

    // Constructor predeterminado o vacío
    public Cafetera() {
        this.capacidadMaxima = 1000; // Capacidad por defecto de 1000 ml
        this.cantidadActual = 0; // Inicialmente la cafetera está vacía
        this.scanner = new Scanner(System.in);
    }

    // Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        this.scanner = new Scanner(System.in);
    }

    // Métodos getter y setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {	
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Método llenaCafetera(): hace que la cantidad actual sea igual a la capacidad máxima
    public void llenaCafetera() {
        System.out.print("Ingrese la cantidad de café en mililitros para llenar la cafetera: ");
        int cantidad = scanner.nextInt();
        if (cantidad <= capacidadMaxima) {
            cantidadActual = cantidad;
            System.out.println("La cafetera se ha llenado con " + cantidad + " ml de café.");
        } else {
            System.out.println("La cantidad ingresada excede la capacidad máxima de la cafetera.");
        }
    }

    // Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada
    public void servirTaza() {
        System.out.print("Ingrese la cantidad de café en mililitros para servir en la taza: ");
        int cantidadTaza = scanner.nextInt();
        if (cantidadActual >= cantidadTaza) {
            cantidadActual -= cantidadTaza;
            System.out.println("Se ha llenado la taza con " + cantidadTaza + " ml de café.");
        } else {
            System.out.println("No hay suficiente café en la cafetera para llenar la taza.");
            System.out.println("Se llenó la taza con " + cantidadActual + " ml de café.");
            cantidadActual = 0;
        }
    }

    // Método vaciarCafetera(): define la cantidad de café actual en cero
    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera se ha vaciado.");
    }

    // Método para mostrar el menú y realizar acciones
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nMenú de la Cafetera:");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Salir de la cafetera");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    llenaCafetera();
                    break;
                case 2:
                    servirTaza();
                    break;
                case 3:
                    vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Saliendo de la cafetera...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }

    public static void main(String[] args) {
        Cafetera miCafetera = new Cafetera();
        miCafetera.mostrarMenu();
    }
}
