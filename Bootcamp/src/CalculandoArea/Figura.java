package CalculandoArea;

public abstract class Figura {

	private double altura;
	private double base;
	private double radio;
    private double PI = Math.PI;  // Valor de PI
	/**
	 * @param altura
	 * @param base
	 */
	
	
	
	public Figura(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	abstract double calcularArea();
	
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}
	
	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @return the pI
	 */
	public double getPI() {
		return PI;
	}
	
	 
	
}
