
public class Kitap {

	private int sayfaSayisi;
	private String isim;

	public Kitap(int sayfaSayisi, String isim) {
		this.sayfaSayisi = sayfaSayisi;
		this.isim = isim;
	}

	public int sayfaSayisi(Kitap[] kitaplar) {
		int sum = 0;
		for(int counter=0; counter<kitaplar.length; counter++) {
			kitaplar[counter] = new Kitap();
			sum + = kitaplar[counter].getSayfaSayisi();
		}
	}

	public int getSayfaSayisi() {
		return this.sayfaSayisi;
	}
}