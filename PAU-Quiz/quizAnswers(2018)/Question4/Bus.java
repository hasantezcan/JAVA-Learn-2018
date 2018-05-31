
public class Bus {

	private String plate;
	private int seatCount;
	private Seat[] seats;

	// constructor
	public Bus(String plate, int seatCount) {
		this.plate = plate;
		this.seatCount = seatCount;

		seats = new Seat[seatCount];

		for (int i=0; i<seats.length; i++) {
			seats[i] = new Seat(i);
		}
	}

	// methods
	public void bookSeat(Passenger passenger, int seatID) {
		if(seats[seatID].getStatus() == true)
			System.out.println("Koltuk zaten dolu!");
		else {
			seats[seatID].setPassenger(passenger);
			seats[seatID].setStatus(true);
		}
	}

	public void printAllPassengers() {
		for(int counter=0; counter<seats.length; counter++) {
			System.out.println(seats[counter].display());
		}
	}

	public void printAllAvailableSeatIDs() {
		for(int counter=0; counter<seats.length; counter++) {
			if(seats[counter].getStatus() == false)
				System.out.println(seats[counter].getSeatID());
		}
	}

	// setters
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	// getters
	public String getPlate() {
		return this.plate;
	}
	public int getSeatCount() {
		return this.seatCount;
	}

	
}