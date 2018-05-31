public class Number {

	private static double num;
	private static int total = 0;
	public static int counter /* = 0 */;

	public Number(double num) {
		this.num = num;
		// counter = 0 yaparsan her ulaşıldıktan sonra 1 olur.
		counter++;
	}

	public boolean isInteger() {
		return num == (int)num;
	}

	/**
	 * Positif bolenlerin toplamini hesaplar
	 * @return toplam;
	 */
	public int sumofPositiveDivisors() {
		for (int i=1; i<num; i++) {
			if(num % i == 0)
				total += i;
		}
		return total;
	}

	public boolean isPerfectNumber() {
		if(!isInteger())
			return false;
		return sumofPositiveDivisors() == num;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

}