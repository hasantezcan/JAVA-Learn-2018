
public class Histogram {

	public static void main(String[] args) {
		int[] notlar = {33, 54, 13, 66, 88, 100, 23, 25,
						100, 33, 25, 74, 21, 0, 4, 3, 55,
						2, 11, 12, 41, 53, 23, 75, 23, 34};
		dikHistogram(notlar);
		yatayHistogram(notlar);
	}

	public static void yatayHistogram(int[] array) {
		int[] frequency = new int[10];

		for(int note : array) {
			if(note == 100)
				frequency[9]++;
			else
				frequency[note/10]++;
		}
		System.out.println();
		System.out.println("    Yatay Histogram");
		System.out.println("    ###############");

		for(int counter=0; counter<frequency.length; counter++) {
			System.out.printf("    %02d-%02d | ", (counter*10), ((counter==9) ? 100 : ((counter*10)+9)));
			for (int hazne=0; hazne<frequency[counter]; hazne++) {
					System.out.printf(" * ");
			}System.out.println();
		}

	}

	public static void dikHistogram(int[] array) {
		int[] frequency = new int[10];
		int max = 0;
		for(int note : array) {
			if(note == 100)
				frequency[9]++;
			else
				frequency[note/10]++;
		}
		for(int temp: frequency) {
			if(temp > max) { max = temp; }
		}

		System.out.println();
		System.out.println("    Dikey Histogram");
		System.out.println("    ###############");

		for(int counter=max; counter>0; counter--) {
			System.out.printf("%5d|", counter);
				for(int hazne=0; hazne<frequency.length; hazne++) {
					if(frequency[hazne] == counter) {
						System.out.printf("  *    ");
						frequency[hazne]--;
					}
					else
						System.out.printf("       ");
				}
				System.out.println();
		}

		System.out.println("      ------|------|------|------|------|------|------|------|------|------");
		System.out.println("       0-9   10-19  20-29  30-39  40-49  50-59  60-69  70-79  80-89  90-100");
	}
}