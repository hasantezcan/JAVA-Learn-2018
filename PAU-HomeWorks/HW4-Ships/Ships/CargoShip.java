package Ships;

public class CargoShip extends Ship {

    private double maxCargoCapacity;

    public CargoShip(String name, String builtDate, double maxCargoCapacity) {

        super(name, builtDate);

        this.maxCargoCapacity = maxCargoCapacity;
    }

    public double getMaxCargoCapacity() {
        return maxCargoCapacity;
    }

    public void setMaxCargoCapacity(double maxCargoCapacity) {
        this.maxCargoCapacity = maxCargoCapacity;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s ", super.toString(), " Max Cargo Capacity   =", getMaxCargoCapacity(), "kg");
    }

}
