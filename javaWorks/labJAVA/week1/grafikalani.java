import java.io.Console;

public class grafikalani {
	public static void main(String[] args) {
		System.out.print("Sayi: ");
		Console console = System.console();
		String s = console.readLine();
		int x = Integer.parseInt(s);
		double adim = 0.01;
		float toplam=0;
		for (float i=-x; i<=x; i+=adim) {
			toplam += Math.pow(i,2)*adim;
		}
		System.out.println("Grafik Alani: "+toplam);
	}
}