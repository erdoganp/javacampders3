package javacampders3odev;

public class Instructor extends User {
	
	private String instructorCourse;
	
	public String getInstructorCourses() {
		
		return this.instructorCourse;
	}
	
	public void setInstructorCourses(String instructorCourse) {
		this.instructorCourse=instructorCourse;
	}
}
