package EjercicioAdoptar;

public class Persona {
		
		private String nombre;
	    private String apellido;
	    private int edad;
	    private String rut;
	   

	    public Persona(String nombre, String apellido, int edad, String rut) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.edad = edad;
	        this.rut = rut;
	      
	    }

	    @Override
	    public String toString() {
	        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", RUT: " + rut ;
	    }
	}

