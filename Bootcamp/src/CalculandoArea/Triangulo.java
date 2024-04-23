package CalculandoArea;

class Triangulo extends Figura {

	/**
	 * @param altura
	 * @param base
	 */
	public Triangulo(double altura, double base) {
		super(altura, base);
	}

	double calcularArea() {
		// TODO Auto-generated method stub
		return (getBase() * getAltura())/2 ;
	}

                                    
	
}