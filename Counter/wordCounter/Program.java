package wordCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		BufferedReader InputReader = new BufferedReader(new InputStreamReader(System.in));

		String countStuff;

		while (true) {
			System.out.println("Choose alternative: ");
			System.out.println("1. Words");
			System.out.println("2. Letters");
			System.out.println("3. Words and Letters");


			switch (InputReader.readLine()) {
			case "1":
				System.out.println("Words: ");
				countStuff = InputReader.readLine();
				Counter.countWords(countStuff);
				break;
			case "2":
				System.out.println("Letters: ");
				countStuff = InputReader.readLine();
				Counter.countLetters(countStuff);
				break;
			case "3":
				System.out.println("Words and letters:");
				countStuff = InputReader.readLine();
				Counter.countLettersAndWords(countStuff);
				break;
			default:
				break;
			}
		}
	}
}