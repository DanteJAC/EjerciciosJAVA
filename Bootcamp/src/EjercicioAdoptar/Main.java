package EjercicioAdoptar;

public class Main {

	  public static void main(String[] args) {
	        Perro perro1 = new Perro("Bobby", "Labrador", 3, "Grande");
	        Perro perro2 = new Perro("Firulais", "Chihuahua", 2, "Pequeño");

	        Persona persona1 = new Persona("Juan", "Perez", 30, "12345678-9");
	        Persona persona2 = new Persona("Maria", "Gonzalez", 25, "98765432-1");

	        System.out.println("Información de la Persona 1:");
	        System.out.println(persona1);
	        System.out.println("Información del Perro de la Persona 1:");
	        System.out.println(perro1.toString());

	        System.out.println("\nInformación de la Persona 2:");
	        System.out.println(persona2);
	        System.out.println("Información del Perro de la Persona 2:");
	        System.out.println(perro2.toString());
	    }
	}

