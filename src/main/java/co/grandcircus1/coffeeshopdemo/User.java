package co.grandcircus1.coffeeshopdemo;

public class User {
	
	private String Firstname;
	private String Lastname;
	private String Email;
	private Integer Phonenumber;
	private String Password;
	
	public User() {
		
	}
	public User(String firstname, String lastname, String email, Integer phonenumber, String password) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		Phonenumber = phonenumber;
		Password = password;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(Integer phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [Firstname=" + Firstname + ", Lastname=" + Lastname + ", Email=" + Email + ", Phonenumber="
				+ Phonenumber + ", Password=" + Password + "]";
	}

}
