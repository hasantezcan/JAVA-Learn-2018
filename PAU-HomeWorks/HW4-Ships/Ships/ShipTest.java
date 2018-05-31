package Ships;

public class ShipTest {

    public static void main(String[] args) {

        Ship s1 = new Ship("SedeGemi", "09/09/1250");

        Ship t1 = new TouristShip("Akıncı", "01/01/1960", 1500);

        Ship c1 = new CargoShip("DeliYürek", "05/05/1858", 500000);

        Ship[] ShipArray = new Ship[3];
        ShipArray[0] = s1;
        ShipArray[1] = t1;
        ShipArray[2] = c1;

        for (int i = 0; i < ShipArray.length; i++) {

            System.out.printf("%d.Ship = %s \n", i + 1, ShipArray[i]);
        }

    }

}
