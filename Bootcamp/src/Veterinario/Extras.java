package Veterinario;

class Extras extends Animal {

	/**
	 * @param nombre
	 * @param peso
	 */
	public Extras(String nombre, double peso) {
		super(nombre, peso);
	}
	 // Método para saludar
    public String hacerRuido()	{
    	return "Hola";
    }
	
}
