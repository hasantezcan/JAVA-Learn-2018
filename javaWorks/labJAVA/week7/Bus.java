
public class Bus {
	private String plate;
	private int seatCount;
	private Seat[] seats;

	// constructors
	public Bus(String plate, int seatCount) {
		this.plate = plate;
		this.seatCount = seatCount;

		seats = new Seat[seatCount];
		for (int i=0; i <seatCount; i++) {
			seats[i] = new Seat(i+1);
		}
	}

	// methods
	public void printAllAvailableSeats() {
		for (int i=0; i<seatCount; i++) {
			if(seats[i].getStatus() == false)
				System.out.println(seats[i].Display());
		}
	}

	public void bookSeat(Passenger passenger, int seatId) {
		if(seats[seatId].getStatus() == true)
			System.out.println("Seat already booked!");
		else {
			seats[seatId].setPassenger(passenger);
			seats[seatId].setStatus(true);
		}
	}

	public void printAllPassengers() {
		for (int i=0; i<seatCount; i++) {
			System.out.println(seats[i].Display());
		}
	}

	// setters
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public void setSeatount(int seatCount) {
		this.seatCount = seatCount;
	}

	// getters
	public String getPlate() {
		return plate;
	}
	public int getSeatCount() {
		return seatCount;
	}

}