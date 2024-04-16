package Clase72;

public class Cuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LLAMAMOS A LA CLASE
    	CuentasAtributo ca = new CuentasAtributo();
    
    //	ca.Cuenta();

	//MUESTRA INFORMACIÓN
	System.out.println("\nInformación de la cuenta:");
	System.out.println("Número de cuenta: " + ca.getNumeroCuenta());
	System.out.println("Titular: " + ca.getNombre());
	System.out.println("Saldo: $" + ca.getSaldo());
	}

}
