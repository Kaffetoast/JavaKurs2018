import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {

		BufferedReader InputReader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("1. Count Words");
			System.out.println("2. Count Letters");
			System.out.println("3. Count Words and Letters");

			String choice = InputReader.readLine();

			System.out.println("Enter Word: ");
			String str = InputReader.readLine();

			switch (choice) {
			case "1":
				if (!str.isEmpty()) { 
				WordCounter.countWords(str);
				}
				break;
			case "2":
				if (!str.isEmpty()) {
				LetterCounter.countLetters(str);
				}
				break;
			case "3": 
				if (!str.isEmpty()) {
				WordCounter.countWords(str);
				LetterCounter.countLetters(str);
				}
				break;

			}
		}

	}

}