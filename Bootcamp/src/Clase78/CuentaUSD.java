package Clase78;

public class CuentaUSD extends CuentaDigital {

	/**
	 * @param titular
	 * @param saldo
	 */
	public CuentaUSD(String titular, double saldo) {
		super(titular, saldo);
	}

	@Override
	public boolean verificarFondos() {
		// TODO Auto-generated method stub
		return getSaldo() >= 0;
	}

}
