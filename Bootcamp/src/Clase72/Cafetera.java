package Clase72;


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

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual +
                '}';
    }
}
