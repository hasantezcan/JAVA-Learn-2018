
public class Seat {

	private int seatID;
	private boolean status;
	private Passenger passenger;

	// constructor
	public Seat(int seatID) {
		this.seatID = seatID;
	}

	// method
	public String display() {
		return String.format("ID:%d, %s", this.seatID, ((this.status==false) ? "Status: Bos" : passenger.display()));
	}

	// setters
	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	// getters
	public int getSeatID() {
		return seatID;
	}
	public boolean getStatus() {
		return status;
	}
	public Passenger getPassenger() {
		return passenger;
	}


}