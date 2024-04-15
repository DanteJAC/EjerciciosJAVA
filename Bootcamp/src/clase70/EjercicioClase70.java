package clase70;



	
	import java.util.Scanner;

	public class EjercicioClase70 {
	    // Atributos
	    private int numCuenta;
	    private String titular;
	    private double saldoActual;

	    // Constructor sin parámetros
	    public EjercicioClase70() {
	        // Se pueden asignar valores predeterminados o dejarlos en 0 o null
	        this.numCuenta = 0;
	        this.titular = "";
	        this.saldoActual = 0.0;
	    }

	    // Constructor con parámetros
	    public EjercicioClase70(int numCuenta, String titular, double saldoActual) {
	        this.numCuenta = numCuenta;
	        this.titular = titular;
	        this.saldoActual = saldoActual;
	    }

	    // Métodos de acceso
	    public int getNumCuenta() {
	        return numCuenta;
	    }

	    public void setNumCuenta(int numCuenta) {
	        this.numCuenta = numCuenta;
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public void setTitular(String titular) {
	        this.titular = titular;
	    }

	    public double getSaldoActual() {
	        return saldoActual;
	    }

	    public void setSaldoActual(double saldoActual) {
	        this.saldoActual = saldoActual;
	    }

	    // Método para mostrar los datos de la cuenta
	    public void mostrarDatos() {
	        System.out.println("Número de cuenta: " + numCuenta);
	        System.out.println("Titular: " + titular);
	        System.out.println("Saldo: $" + saldoActual);
	    }

	    // Método para ingresar saldo a la cuenta
	    public void ingresarSaldo(double monto) {
	        saldoActual += monto;
	        System.out.println("Se han depositado $" + monto + " en la cuenta.");
	        System.out.println("Nuevo saldo: $" + saldoActual);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario los datos de la cuenta
	        System.out.print("Ingrese el número de cuenta: ");
	        int numCuenta = scanner.nextInt();
	        scanner.nextLine(); // Limpiar el buffer del scanner
	        System.out.print("Ingrese el nombre del titular: ");
	        String titular = scanner.nextLine();
	        System.out.print("Ingrese el saldo actual: ");
	        double saldoActual = scanner.nextDouble();

	        // Crear un objeto CuentaBancaria
	        EjercicioClase70 cuenta = new EjercicioClase70(numCuenta, titular, saldoActual);

	        // Mostrar los datos de la cuenta
	        System.out.println("\nDatos de la cuenta:");
	        cuenta.mostrarDatos();

	        // Ingresar saldo a la cuenta
	        System.out.print("\nIngrese la cantidad que desea depositar: ");
	        double montoDeposito = scanner.nextDouble();
	        cuenta.ingresarSaldo(montoDeposito);

	        // Cerrar el scanner
	        scanner.close();
	    }
	}

