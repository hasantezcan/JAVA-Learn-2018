import java.util.Scanner;

public class Pi {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sayac=0, points=0, basamak;
		long hassas=100;
		double x, y, result;

		System.out.println("Pi sonrasi basamak sayisi: ");
		basamak = input.nextInt();

		do{
			x = Math.random();
			y = Math.random();
			points += x*x + y*y <= 1 ? 1 : 0;
			sayac++;
			result = 1 * (double)points / hassas;
			result *= 4;
		} while( result != 3.141 );

		

		System.out.println("Daire içindeki  nokta adedi: "+ points);
		System.out.printf("Math.PI: %.2f \n", Math.PI);
		System.out.println("Buldugumuz sonuc: "+ result);
	}
}