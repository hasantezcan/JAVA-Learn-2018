
public class Human {

	enum Gender {
		MALE,
		FEMALE;
	}

	enum BloodGroup {
		A_POS("A","+"),
		B_POS("B","+"),
		AB_POS("AB","+"),
		O_POS("O","+"),
		A_NEG("A","-"),
		B_NEG("B","-"),
		AB_NEG("AB","-"),
		O_NEG("O","-");
		

		String Type;
		String Rh;

		BloodGroup(String type, String rh) {
			Type = type;
			Rh = rh;
		}

		String getFullGroupName() {
			return Type+" "+Rh;
		}
	}

	public int age;
	public Gender gender;
	public String hairColor;
	public BloodGroup bloodGroup;

	public Human(int age, Gender gender, String hairColor, BloodGroup bloodGroup) {
		this.age = age;
		this.gender = gender;
		this.hairColor = hairColor;
		this.bloodGroup = bloodGroup;
	}
}