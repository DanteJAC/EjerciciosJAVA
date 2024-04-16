package Cafetera;

import java.util.Scanner;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado o vacío
    public Cafetera() {
        this.capacidadMaxima = 1000; // Capacidad por defecto de 1000 ml
        this.cantidadActual = 0; // Inicialmente la cafetera está vacía
    }

    // Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
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
        cantidadActual = capacidadMaxima;
    }

    // Método servirTaza(int): simula la acción de servir una taza con la capacidad indicada
    public void servirTaza(int tamanoTaza) {
        if (cantidadActual >= tamanoTaza) {
            cantidadActual -= tamanoTaza;
            System.out.println("Se ha llenado la taza.");
        } else {
            System.out.println("No hay suficiente café en la cafetera para llenar la taza.");
            System.out.println("Se llenó la taza con " + cantidadActual + " ml de café.");
            cantidadActual = 0;
        }
    }

    // Método vaciarCafetera(): define la cantidad de café actual en cero
    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    // Método agregarCafe(int): añade a la cafetera la cantidad de café indicada
    public void agregarCafe(int cantidad) {
        cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la capacidad máxima de la cafetera
        System.out.print("Ingrese la capacidad máxima de la cafetera en mililitros: ");
        int capacidadMaxima = scanner.nextInt();

        // Solicitar al usuario la cantidad inicial de café en la cafetera
        System.out.print("Ingrese la cantidad inicial de café en la cafetera en mililitros: ");
        int cantidadInicial = scanner.nextInt();

        // Crear una cafetera usando el constructor con capacidad máxima y cantidad inicial
        Cafetera miCafetera = new Cafetera(capacidadMaxima, cantidadInicial);

        // Mostrar estado inicial de la cafetera
        System.out.println("\nEstado inicial de la cafetera:");
        System.out.println(miCafetera);

        // Llenar la cafetera
        miCafetera.llenaCafetera();
        System.out.println("\nCafetera llenada:");
        System.out.println(miCafetera);

        // Servir una taza de café
        System.out.print("\nIngrese la cantidad de café en mililitros que desea servir en la taza: ");
        int cantidadTaza = scanner.nextInt();
        miCafetera.servirTaza(cantidadTaza);
        System.out.println(miCafetera);

        // Agregar café
        System.out.print("\nIngrese la cantidad de café en mililitros que desea agregar a la cafetera: ");
        int cantidadAgregar = scanner.nextInt();
        miCafetera.agregarCafe(cantidadAgregar);
        System.out.println("Después de agregar " + cantidadAgregar + " ml de café:");
        System.out.println(miCafetera);

        // Vaciar la cafetera
        miCafetera.vaciarCafetera();
        System.out.println("\nCafetera vaciada:");
        System.out.println(miCafetera);

        scanner.close();
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual +
                '}';
    }
}