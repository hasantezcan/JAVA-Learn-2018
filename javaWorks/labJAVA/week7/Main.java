
public class Main {

	public static void main(String[] args) {
		
		Bus haydar = new Bus("20 PAU 20", 42);
		//haydar.printAllAvailableSeats();

		Phone ph1 = new Phone(258, 1234567, "office");
		Passenger ps1 = new Passenger("Ahmet", "Haydar", "Male", ph1);
		haydar.bookSeat(ps1, 40);

		Phone ph2 = new Phone(258, 7654321, "work");
		Passenger ps2 = new Passenger("Haydar", "Ahmer", "Female", ph2);
		haydar.bookSeat(ps2, 1);
		haydar.printAllPassengers();
	}
}