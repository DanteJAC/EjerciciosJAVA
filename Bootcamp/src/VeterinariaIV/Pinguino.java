package VeterinariaIV;

class Pinguino extends Animal {

	public void hacerRuido() {
        System.out.println("El Pinguino si puede hacer ruido");
    }

    @Override
    public void comer() {
        System.out.println("El Pinguino está comiendo");
    }

    @Override
    public void moverse() {
        System.out.println("El Pinguino corre por ahi");
    }

	@Override
	void volar() {
		 System.out.println("El Pinguino no puede volar");
		
	}

	@Override
	void picotear() {
		 System.out.println("El Pinguino si puede picotear");
		
	}
}

	

