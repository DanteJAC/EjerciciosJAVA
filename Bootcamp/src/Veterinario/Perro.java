package Veterinario;

class Perro extends Animal {
private String raza;

// Constructor
public Perro(String nombre, double peso, String raza) {
	// Llama al constructor de la superclase (CON SUPER)
	 super(nombre, peso); 
   this.raza = raza;
}

// Getter específico para el atributo limiteCredito
public String getRaza() {
   return raza;
}
}
