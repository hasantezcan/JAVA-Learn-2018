public class NumberTest {
	public static void main(String[] args) {
		Number n1 = new Number(28);
		//System.out.println("n1: "+ n1.getNum());

		//Number n2 = new Number(4.5);
		//System.out.println("n2: "+ n2.getNum());
		//System.out.println("n1: "+ n1.getNum());

		//System.out.println("Object Count: "+Number.counter); 
		//static'te nesne oluşturmadan direkt erişilebilir.

		System.out.println("isInteger: "+n1.isInteger());
		System.out.println("Total: "+n1.sumofPositiveDivisors());
		for (int i = 1; i<100; i++) {
			Number tempNumber = new Number(i);
			if(tempNumber.isPerfectNumber()){
				System.out.println(i);
				System.out.println("perfect");
			}
		}
	}
}