package Veterinario;

class Perro extends Animal {
    String raza;

    // Constructor de la clase Perro que llama al constructor de la superclase Animal
    public Perro(String nombre, double peso, String raza) {
        super(nombre, peso);
        this.raza = raza;
    }
        // Método para que el perro emita un ladrido
        @Override
        public String emitirSonido() {
            return "Guau";
            
    }
    
   
    // Método para imprimir los valores del perro por pantalla
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Peso: " + getPeso());
        System.out.println("Raza: " + raza);
    }
}