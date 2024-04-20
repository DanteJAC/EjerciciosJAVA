package CalculandoArea;

class Circulo extends Figura {
    
    
    /**
	 * @param PI
	 * @param Radio
	 */
	public Circulo( final double PI, int Radio) {
		super(PI, Radio);
	}


	@Override
    double calcularArea() {
        return (getPI() * getRadio() * getRadio());
    }
}