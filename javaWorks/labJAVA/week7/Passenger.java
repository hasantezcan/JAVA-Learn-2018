
public class Passenger {

	private String name;
	private String surname;
	private String gender;
	private Phone phone;

	// constructors
	public Passenger(String name, String surname, String gender, Phone phone) {
		this.name = name;
		this.surname = surname; 
		this.gender = gender;
		this.phone = phone;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	// getters
	public String getName() {
		return this.name;
	}
	public String getSurName() {
		return this.surname;
	}
	public String getGender() {
		return this.gender;
	}
	public Phone getNumber() {
		return this.phone;
	}

	// display
	public String Display() {
		return "Name:"+name+" Surname:"+surname+" gender:"+gender+" "+phone.Display();
	}
}