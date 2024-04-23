package CalculandoArea;

class Circulo extends Figura {
    
    
    /**
	 * @param PI
	 * @param Radio
	 */
	public Circulo( final double PI, double Radio) {
		super(PI, Radio);
	}


  


	@Override
    double calcularArea() {
        return (Math.PI * (getRadio() * getRadio()));
    }
}