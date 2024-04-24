package Correccion;

public class Student {
	private String name;
	private int age;
	private double gpa;
	private Teacher teacher;
	/**
	 * @param name
	 * @param age
	 * @param gpa
	 * @param teacher
	 */
	public Student(String name, int age, double gpa, Teacher teacher) {
		
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	
	public void setTeacher(Teacher teacher ) {
		this.teacher = teacher;
	}

	public void enrollInCourse(String courseName) {
        System.out.println(name + " has enrolled in " + courseName + ".");
        teacher.teachCourse(courseName);
	}

}
