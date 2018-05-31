import java.util.Arrays;

public class Passenger {

	private String name;
	private String surname;
	private char gender;
	private int phone;

	// constructor
	public Passenger(String name, String surname, char gender, int phone) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.phone = phone;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setSurName(String surname) {
		this.surname = surname;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

	// getters
	public String getName() {
		return this.name;
	}
	public String getSurName() {
		return this.surname;
	}
	public char getGender() {
		return this.gender;
	}
	public int getPhone() {
		return this.phone;
	}

	// method
	public String display() {
		return String.format("Name:%s %s, Gender:%c, Phone:%d", this.name, this.surname, this.gender, this.phone);
	}
}