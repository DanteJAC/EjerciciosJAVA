package Veterinario;


// Clase Animal
class Animal {
    String nombre;
    double peso;

    // Constructor de la clase Animal
    public Animal(String nombre, double peso) {
        this.setNombre(nombre);
        this.setPeso(peso);
    }
    
    // Método para que los animales coman
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    // Método para que los animales duerman
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    // Método para que los animales emitan un sonido
    public String emitirSonido() {
        return "Sonido de animal";
    }
    
    // Método para hcaer un ruido
    public String hacerRuido() {
    	return "devolver un saludo";
    }


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}

