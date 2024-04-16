package EjemploGetterandSetter;

/**
 * Ejemplo de Getter and setter en Main
 */
public class EjemploMain {

	public static void main(String[] args) {
		Ejemplo2 obj = new Ejemplo2();
		obj.setEdad(28);
		System.out.println("Su edad es: " + obj.getEdad());	
		obj.setNombre("Dante");
		System.out.println("Su nombre es: " + obj.getNombre());	
	}
}
