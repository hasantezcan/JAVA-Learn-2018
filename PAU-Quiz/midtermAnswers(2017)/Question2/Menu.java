
public class Menu {

	private final String[][] corba;
	private final String[][] kebap;
	private final String[][] salata;

	// constructor
	public Menu() {
		corba = new String[][]{
					{"Ezogelin", "8TL"},
					{"Kelle Paça", "10TL"},
					{"Tarhana", "7TL"},
					{"Mercimek", "8TL"}
		};
		kebap = new String[][]{
					{"Adana Kebap", "18TL"},
					{"Beyti Sarma", "22TL"},
					{"Urfa Kebap", "18TL"}
		};
		salata = new String[][]{
					{"Çoban Salata", "5TL"},
					{"Ton Balıklı Salata", "12TL"},
					{"Mevsim Salata", "8TL"}
		};
	}

	// getters
	public String[][] getCorba() {
		return corba;
	}
	public String[][] getKebap() {
		return kebap;
	}
	public String[][] getSalata() {
		return salata;
	}
}