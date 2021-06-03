package javacampders3odev;

public class Main {

	public static void main(String[] args) {
		
		Student student1 =new Student();
		student1.setId(1);
		student1.setName("erdogan");
		student1.setCourse("Java");
		student1.setEmail("javacamp@gmail.com");
		
		Student student2=new Student();
		student2.setId(2);
		student2.setName("cengiz");
		student2.setCourse("C#");
		student2.setEmail("csharpcamp@gmail.com");
		
		Student[] students= {student1,student2};
		
		StudentManager studentManager=new StudentManager();
		studentManager.addUser(student1);
		studentManager.addUser(student2);
		
		studentManager.addCourse(student1);
		studentManager.addCourse(student2);
		
		studentManager.addMultipleUser(students);
		
		

	}

}
