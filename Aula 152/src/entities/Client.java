package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private String name;
	private Date birthDate;
	private String email;
	private static SimpleDateFormat dformatter = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client() {
		
	}
	
	public Client(String name, Date birthDate, String email) {
		this.name = name;
		this.birthDate = birthDate;
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return name
				+ " (" + dformatter.format(birthDate) + ") - "
				+ email;
	}
	
}
