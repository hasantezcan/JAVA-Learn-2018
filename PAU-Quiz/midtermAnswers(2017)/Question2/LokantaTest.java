
public class LokantaTest {

	public static void main(String[] args) {
		
		Lokanta lokanta = new Lokanta("Kebapçı", 30, "Bora Tanrıkulu", "ABC sokak, DEF mahallesi, QWE/Turkiye");
		lokanta.showMenu();
		System.out.println("\n");
		lokanta.yerAyirt(4);
		System.out.println();
		lokanta.yerAyirt(11);
	}
}