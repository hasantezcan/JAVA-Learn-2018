import java.util.ArrayList;

public class OddNEvenNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();

		array.add(3);array.add(1);array.add(9);array.add(4);
		array.add(7);array.add(5);array.add(3);array.add(1);

		System.out.println(ratio(array));
	}

	public static double ratio(ArrayList<Integer> array) {
		int evenNumbers = 0;
		int oddNumbers = 0;

		for (int temp : array) {
			if (temp%2 == 0)
				evenNumbers += temp;
			else
				oddNumbers += temp;
		}

		return (double)evenNumbers/oddNumbers;
	}
}