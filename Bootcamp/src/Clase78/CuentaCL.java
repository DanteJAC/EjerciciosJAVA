package Clase78;

class CuentaCL extends CuentaDigital {

	/**
	 * @param titular
	 * @param saldo
	 */
	public CuentaCL(String titular, double saldo) {
		super(titular, saldo);
	}

	@Override
	public boolean verificarFondos() {
		// TODO Auto-generated method stub
		return getSaldo()>=0;
	}

	
	

}
