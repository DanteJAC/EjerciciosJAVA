package Veterinario;

// Clase Gato que hereda de Animal
class Gato extends Animal {

    // Constructor de la clase Gato
    public Gato(String nombre, double peso) {
        super(nombre, peso);
    }

    // Método para que el gato emita un maullido
    @Override
    public String emitirSonido() {
        return "Miau";}
    
   
    
}