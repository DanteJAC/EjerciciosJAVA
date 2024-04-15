package clase70;

public class CuentaClass {

	// Atributos
   
	private int numCuenta;
    private double saldo;
    private String nombre;
   
    //Constructor sin parámetros (Valor por defecto)
    
    public CuentaClass() {
        this.numCuenta = 0;
        this.saldo = 0.0;
        this.nombre = "";
    }
	
 // Constructor con parámetros (Instanciamos la cuenta)
    public CuentaClass(int numCuenta, double saldo, String nombre) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.nombre = nombre;
    }
	
 // Método para mostrar los valores de los atributos
    public void mostrarInformacion() {
        System.out.println("Número de cuenta: " + numCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Titular: " + nombre);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   // Crear una instancia
    	CuentaClass miCuenta = new CuentaClass(7489, 30000.0, "Dante Escalona");
        // Mostrar la información
        miCuenta.mostrarInformacion();
    }
}


