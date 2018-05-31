
public class Main {

	public static void main(String[] args) {
		Bus bus = new Bus("20 PAU 20", 42);
		
		Passenger passenger1 = new Passenger("Bora", "Tanrıkulu", 'E', 123123123);
		Passenger passenger2 = new Passenger("Ayşe", "Fatma", 'K', 321321321);
		Passenger passenger3 = new Passenger("Hasan", "Hüseyin", 'E', 213213213);
		
		bus.bookSeat(passenger1, 1);
		bus.bookSeat(passenger2, 22);
		bus.bookSeat(passenger3, 33);
		
		bus.printAllPassengers();
	}
}