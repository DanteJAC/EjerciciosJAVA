package Correccion;

public class Teacher {
	
	private String name;
	
	public Teacher(String name) {
		this.name = name;
	}

	public void teachCourse(String courseName) {
		// TODO Auto-generated method stub
		
		System.out.println(name + " is teaching " + courseName + ".");
		
	}

	public void providFeedback() {
		System.out.println(name + " is providing feedback to the student.");
	}

}
