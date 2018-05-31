
public class Seat {

	private int seatId;
	private boolean status;
	private Passenger passenger;

	// constructors
	public Seat(int seatId) {
		this.seatId = seatId;
	}

	// setters
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	// getters
	public int getSeatId() {
		return seatId;
	}
	public boolean getStatus() {
		return status;
	}
	public Passenger getPassenger() {
		return passenger;
	}

	// display
	public String Display() {
		return "Seat id:"+seatId+(status==false?"Status: Avaliable":("Passenge Info"+passenger.Display()));
	}
}