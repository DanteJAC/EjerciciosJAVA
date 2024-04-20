package CalculandoArea;

class Rectangulo extends Figura {
	
	
       
    /**
	 * @param altura
	 * @param base
	 */
	public Rectangulo(double altura, double base) {
		super(altura, base);
	}

	
    @Override
    double calcularArea() {
        return (getBase() * getAltura());
    }
}