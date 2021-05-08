package Entites;

import java.util.Date;

import Abstract.Entity;

public class Member implements Entity {
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private Date dateOfBirth;
	
	public Member() {
		
	}

	public Member(int id, String username, String password, String firstName, String lastName, String nationalityId,
			Date dateOfBirth) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}
	
	

}
