
public class UcBes {

	public int[] doSomething(int[] sayi) {
		for (int i=0; i<sayi.length; i++) {
			sayi[i] = sayi[(i+1)%3];
		}
		return sayi;
	}

	public void display(int[] sayi) {
		for (int i=0; i<sayi.length; i++) {
			System.out.println(sayi[i]);
		}
	}

	public static void main(String[] args) {
		UcBes cObj = new UcBes();
		int[] dizi1 = { 1,3,5,0,9};
		int[] dizi2 = cObj.doSomething(dizi1);
		cObj.display(dizi1);
		System.out.println("-----");
		cObj.display(dizi2);
	}
}