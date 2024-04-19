package Clase76;

class TarjetaDeCredito extends FormaDePago {

	private int cantidadCuotas;

	/**
	 * @param cantidadCuotas
	 */
	public TarjetaDeCredito(int cantidadCuotas) {
		super();
		this.cantidadCuotas = cantidadCuotas;
	}

	/**
	 * @return the cantidadCuotas
	 */
	public int getCantidadCuotas() {
		return cantidadCuotas;
	}
	
}
