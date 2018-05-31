package Ships;

public class TouristShip extends Ship {

    private double maxPassengerNumber;

    public TouristShip(String name, String builtDate, double maxPassengerNumber) {
        super(name, builtDate);

        this.maxPassengerNumber = maxPassengerNumber;
    }

    public double getMaxPassengerNumber() {
        return maxPassengerNumber;
    }

    public void setMaxPassengerNumber(double maxPassengerNumber) {
        this.maxPassengerNumber = maxPassengerNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f ", super.toString(), " Max Passenger Number =", getMaxPassengerNumber());
    }

}
