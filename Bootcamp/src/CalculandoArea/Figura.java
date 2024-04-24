package CalculandoArea;

public abstract class Figura {

	private double Valor1;
	private double Valor2;
	
	/**
	 * @param altura = Valor1
	 * @param base = Valor2
	 */
	
	
	//
	public Figura(double Valor1, double Valor2) {
		this.Valor1 = Valor1;
		this.Valor2 = Valor2;
		
	}
	
	abstract double calcularArea();
	
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return Valor1;
	}
	/**
	 * @return the base
	 */
	public double getBase() {
		return Valor2;
	}
	
	/**
	 * @return the radio
	 */
	public double getRadio() {
	//	return radio;
		return Valor1;
	}
	/**
	 * @return the pI
	 */
	public double getPI() {
	//	return PI;
		return Valor2;
	}
	
	 
	
}
