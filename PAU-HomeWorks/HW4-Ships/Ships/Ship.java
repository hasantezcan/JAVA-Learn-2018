package Ships;

public class Ship {

    private String name;
    private String builtDate;

    public Ship(String name, String builtDate) {
        this.name = name;
        this.builtDate = builtDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuiltDate() {
        return builtDate;
    }

    public void setBuiltDate(String builtDate) {
        this.builtDate = builtDate;
    }

    @Override
    public String toString() {

        return String.format("Ship Name= %10s  Ship Built Date= %10s", getName(), getBuiltDate());

    }

}
