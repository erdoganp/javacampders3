package javacampders3odev;

public class InstructorManager extends UserManager {
	public void instructorCourse(Instructor instructor) {
		System.out.println(instructor.getName()+" hocamiz "+instructor.getInstructorCourses()+ " a kursu açtı");
	}
}
