import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValue {
	public static void main(String[] args) throws IOException {
		System.out.print("Input a value: "); // "ln" means new line
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		String s = br.readLine(); // first, takes a string variable than
		int x = Integer.parseInt(s); // translate to int variable
		double kare = Math.pow(value, 2);
		System.out.println(value+"'nin karesi "+kare); 
	}
}