package javacampders3odev;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getName()+" isimli user eklendi");
	}
	
	public void addMultipleUser(User[] users) {
		for(User user: users ) {
			addUser(user);
		}
	}

}
