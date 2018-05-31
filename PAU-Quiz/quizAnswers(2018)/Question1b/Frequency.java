
public class Frequency {

	public static void main(String[] args) {
		int[] array = {4,4,3,6,8,9,7,6,4,6,7,8,6,5,3,1,2,4,5,6};

		System.out.println(findFrequency(array));
	}

	public static int findFrequency(int[] array) {
		int[] frequency = new int[11];
		int max = 0;
		int counter = 0;
		int location = 0;

		for(int value : array) {
			frequency[value]++;
		}

		for(int value : frequency) {
			if(value > max) {
				max = value;
				location = counter;
			}
			counter++;
		}

		return location;
	}
}