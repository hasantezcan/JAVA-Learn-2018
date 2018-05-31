
public class Lokanta {

	private Menu menu;
	private String[][] temp;
	private String lokantaAdi;
	private String lokantaAdresi;
	private String lokantaSahibi;
	private final int masa;
	private int bosMasa;

	public Lokanta(String lokantaAdi, int bosMasa, String lokantaSahibi, String lokantaAdresi) {
		menu = new Menu();
		this.lokantaAdi = lokantaAdi;
		this.bosMasa = bosMasa;
		this.masa = bosMasa;
		this.lokantaSahibi = lokantaSahibi;
		this.lokantaAdresi = lokantaAdresi;
	}

	public void yerAyirt(int yerSayisi) {
		if(bosMasa <= 0)
			System.out.println("Yeterli yerimiz yoktur!");
		else {
			bosMasa -= yerSayisi;
			System.out.println(yerSayisi+" kadar yer ayrıldı.");
			System.out.println("Kalan masa sayisi "+bosMasa);
			System.out.println("Dolu masa sayisi "+(masa-bosMasa));
		}
	}

	public void showMenu() {
		temp = menu.getCorba();
		System.out.println(" Corbalar ");
		System.out.println("-----------");
		for(int row=0; row<temp.length; row++) {
			for(int column=0; column<temp[row].length; column++) {
				System.out.print(temp[row][column]+" ");
			} System.out.println();
		}
		temp = menu.getKebap();
		System.out.println("\n Kebaplar ");
		System.out.println("-----------");
		for(int row=0; row<temp.length; row++) {
			for(int column=0; column<temp[row].length; column++) {
				System.out.print(temp[row][column]+" ");
			} System.out.println();
		}
		temp = menu.getSalata();
		System.out.println("\n Salatalar ");
		System.out.println("-----------");
		for(int row=0; row<temp.length; row++) {
			for(int column=0; column<temp[row].length; column++) {
				System.out.print(temp[row][column]+" ");
			} System.out.println();
		}
	}
}