package EjemploGetterandSetter;

/**
 * Ejemplo de Getter and setter definiendo parametros
 */
public class Ejemplo2 {

	private int edad;
	private String nombre;
	
public Ejemplo2() {
	edad=1;
	nombre= "";
	
	
}
//Getter
public int getEdad() {
	return edad;
}
//Setter
public void setEdad(int edad) {
	this.edad = edad;
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
}
