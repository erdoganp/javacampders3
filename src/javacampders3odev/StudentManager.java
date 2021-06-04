package javacampders3odev;

public class StudentManager extends UserManager {
	public void addCourse(Student student) {
		System.out.println(student.getName()+ " isimli öğrenci "+student.getCourse() +" isimli kursa eklendi");
	}
	

}
