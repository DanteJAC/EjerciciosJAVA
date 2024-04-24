package VeterinariaIV;

	// Clase Perro
	class Perro implements Animal {
	    @Override
	    public void hacerRuido() {
	        System.out.println("El perro ladra: ¡Guau guau!");
	    }

	    @Override
	    public void comer() {
	        System.out.println("El perro está comiendo su comida.");
	    }

	    @Override
	    public void moverse() {
	        System.out.println("El perro corre por el parque.");
	    }
	}

