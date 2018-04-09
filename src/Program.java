import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		BufferedReader InputReader = new BufferedReader(new InputStreamReader(System.in));

		boolean loop = true;
		String choice;

		do {
			System.out.println("Choose alternative: ");
			System.out.println("1. Words");
			System.out.println("2. Letters");
			System.out.println("3. Words and Letters");

			choice = InputReader.readLine();

			switch (choice) {
			case "1":
				System.out.println("Words: ");
				String str = InputReader.readLine();
				System.out.println("Total words: " + WordCounter.countWords(str));
				break;
			case "2":
				System.out.println("Letters:");
				String str2 = InputReader.readLine();
				System.out.println("Total letters: " + LetterCounter.countLetters(str2));
				break;
			case "3":
				System.out.println("Words and letters:");
				String str3 = InputReader.readLine();
				System.out.println("Total words: " + WordCounter.countWords(str3));
				System.out.println("Total letters: " + LetterCounter.countLetters(str3));
				break;
			case "4":
				loop = true;
				break;
			}
		} while (loop == true);
		System.out.println("Back");
	}
}