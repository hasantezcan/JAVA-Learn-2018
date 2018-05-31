import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatsYourName {
	public static void main(String[] args) throws IOException {
		System.out.print("What's your name? "); // "ln" means new line
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("Hello "+name+"!");
		/** or you can use like that
			System.out.printf("Hello %s!", name);
		*/
	}
}