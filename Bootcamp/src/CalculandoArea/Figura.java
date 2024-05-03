package CalculandoArea;

public abstract class Figura implements FiguraGeometrica {

	private double Valor1;
	private double Valor2;
	private String Circulo;
	private String Rectangulo;
	private String Triangulo;
	
	/**
	 * @param altura = Valor1
	 * @param base = Valor2
	 */
	
	
	//
	public Figura(double Valor1, double Valor2) {
		this.Valor1 = Valor1;
		this.Valor2 = Valor2;
		
	}
	
	
	
	
	/**
	 * @return the circulo
	 */
	public String getCirculo() {
		return Circulo;
	}

	/**
	 * @return the rectangulo
	 */
	public String getRectangulo() {
		return Rectangulo;
	}

	/**
	 * @return the triangulo
	 */
	public String getTriangulo() {
		return Triangulo;
	}

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
