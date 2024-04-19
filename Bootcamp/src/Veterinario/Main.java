package Veterinario;

public class Main {
	 public static void main(String[] args) {
	     // Crear perro
		 Perro miPerro = new Perro("Lulú", 40.3, "Golden Retriever");
	     System.out.println("Nombre: " + miPerro.getNombre());
	     System.out.println("Peso: " + miPerro.getPeso());
	     System.out.println("Raza: " + miPerro.getRaza());
	 }
	 
}
