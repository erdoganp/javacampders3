package javacampders3odev;

public class User {
	private int id;
	private String name;
	private String surname;
  	private String email;
  	
  	public User() {}
  	
  	public User(int id,String name,String surname,String email) {
  		this.id=id;
  		this.name=name;
  		this.surname=surname;
  		this.email=email;
  	}
  	
  	public int getId() {
  		return this.id;
  	}
  	public void setId(int id) {
  		this.id=id;
  	}
  	public String getName() {
  		return this.name;
  	}
  	public void setName(String name) {
  		this.name=name;
  	}
  	public String getEmail() {
  		return this.email;
  	}
  	public void setEmail(String email) {
  		this.email=email;
  	}

}
