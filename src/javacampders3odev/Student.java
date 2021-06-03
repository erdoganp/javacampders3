package javacampders3odev;

public class Student extends User{
	private String course;
	
	public Student() {}
	
	public Student(String course) {
		this.course=course;
	}
	
	
	public String getCourse() {
		return this.course;
	}
	
	public void setCourse(String course) {
		
		this.course=course;
	}
	
	
	
	 

}
