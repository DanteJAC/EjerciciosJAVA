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
   public String obtenerNombre() {
        return "Rectángulo";
    }

    @Override
   public double calcularArea() {
        return (getBase() * getAltura());
    }
}