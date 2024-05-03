package CalculandoArea;

class Triangulo extends Figura {

	/**
	 * @param altura
	 * @param base
	 */
	public Triangulo(double altura, double base) {
		super(altura, base);
	}

	@Override
		public double calcularArea() {
			return (getBase() * getAltura())/2 ;
	}

	 @Override
	   public String obtenerNombre() {
	        return "Triángulo";
	    }                                
	
}