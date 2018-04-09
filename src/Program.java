import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		BufferedReader InputReader = new BufferedReader(new InputStreamReader(System.in));

		String sentence;

		while (true) {
			System.out.println("Choose alternative: ");
			System.out.println("1. Words");
			System.out.println("2. Letters");
			System.out.println("3. Words and Letters");


			switch (InputReader.readLine()) {
			case "1":
				System.out.println("Words: ");
				sentence = InputReader.readLine();
				Counter.countWords(sentence);
				break;
			case "2":
				System.out.println("Letters: ");
				sentence = InputReader.readLine();
				Counter.countLetters(sentence);
				break;
			case "3":
				System.out.println("Words and letters:");
				sentence = InputReader.readLine();
				Counter.countLettersAndWords(sentence);
				break;
			default:
				break;
			}
		}
	}
}