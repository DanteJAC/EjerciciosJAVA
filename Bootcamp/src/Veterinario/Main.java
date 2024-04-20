package Veterinario;


// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Perro
        Perro miPerro = new Perro("Fido", 10.5, "Labrador");
        
        // Llamar a los métodos de comportamiento del perro
        System.out.println("Perro:");
        miPerro.comer();
        miPerro.dormir();
        System.out.println("Sonido: " + miPerro.emitirSonido());
        
        // Crear un objeto Gato
        Gato miGato = new Gato("Whiskers", 5.5);
        
        // Llamar a los métodos de comportamiento del gato
        System.out.println("\nGato:");
        miGato.comer();
        miGato.dormir();
        System.out.println("Sonido: " + miGato.emitirSonido());
        
        
        Extras Persona = new Extras("Whiskers", 5.5);
        System.out.println("\nExtras:");
        System.out.println("Saludo: " + Persona.hacerRuido());
    }
}