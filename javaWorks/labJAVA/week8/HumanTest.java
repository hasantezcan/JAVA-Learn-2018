
public class HumanTest {

	public static void main(String[] args) {
		
		Human obj1 = new Human(20, Human.Gender.FEMALE, "Yellow", Human.BloodGroup.AB_POS);
		
		System.out.println(obj1.gender);
		System.out.println(obj1.bloodGroup.getFullGroupName());	

	}
}