import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {

		BufferedReader InputReader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.format("1. Count words %n2. Count letters %n3. Count letters and words "
					+ " %n4. Combined sum of letters and words %n");

			String choice = InputReader.readLine();

			System.out.println("Enter String");
			String str = InputReader.readLine();
			
			switch (choice) {
			case "1":
				System.out.println("Total words: " + WordCounter.countWords(str));
				break;
			case "2":
				System.out.println("Total letters: " + LetterCounter.countLetters(str));
				break;
			case "3":
				System.out.println("Total words: " + WordCounter.countWords(str));
				System.out.println("Total letters: " + LetterCounter.countLetters(str));
				break;
			case "4":
				System.out.println("Combined count " + (WordCounter.countWords(str) + LetterCounter.countLetters(str)));
				break;
			default:
				System.out.println("Invalid choice");
				break;
				
			}
		}

	}

}
