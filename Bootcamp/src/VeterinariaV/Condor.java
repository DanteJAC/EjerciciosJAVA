package VeterinariaV;

//Clase Perro
	class Condor extends Animal {
	    @Override
	    public void hacerRuido() {
	        System.out.println("El condor si puede hacer ruido");
	    }

	    @Override
	    public void comer() {
	        System.out.println("El condor está comiendo");
	    }

	    @Override
	    public void moverse() {
	        System.out.println("El condor anda por ahi");
	    }

		@Override
		void volar() {
			 System.out.println("El condor si puede volar");
			
		}

		@Override
		void picotear() {
			 System.out.println("El condor si puede picotear");
			
		}
	}

