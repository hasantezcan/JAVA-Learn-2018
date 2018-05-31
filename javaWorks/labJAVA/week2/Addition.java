import java.util.Scanner;

public class Addition {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int x, y;

		System.out.print("X = ");
		x = input.nextInt();

		System.out.print("Y = ");
		// ya da string olarak alip integer' a cevrilebilir
		y = Integer.parseInt(input.next());

		System.out.println("Result of addition is "+(x + y));
	}
}