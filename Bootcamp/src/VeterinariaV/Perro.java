package VeterinariaV;

	// Clase Perro
	class Perro extends Animal {
	    @Override
	    public void hacerRuido() {
	        System.out.println("El perro ladra: ¡Guau Guau!");
	    }

	    @Override
	    public void comer() {
	        System.out.println("El perro está comiendo");
	    }

	    @Override
	    public void moverse() {
	        System.out.println("El perro corre por ahi");
	    }

		@Override
		void volar() {
			 System.out.println("El perro no puede volar");
			
		}

		@Override
		void picotear() {
			 System.out.println("El perro no puede picotear");
			
		}
	}

