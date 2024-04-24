package CalculandoArea;

class Circulo extends Figura {
    
    
    /**
	 * @param PI
	 * @param Radio
	 */
	public Circulo( double PI, double Radio) {
		super(PI, Radio);
	}


  


	@Override
    double calcularArea() {
        return (getPI() * (getRadio() * getRadio() ));
    }
}
