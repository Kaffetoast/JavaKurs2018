
public class LetterCounter {

	public static void countLetters(String lettercount) {

		char[] array = lettercount.toCharArray();
		int count = 0;
		for (char c : array) {
			if (c != (' ')) {
				count++;
			}
		}
		System.out.println("Total letters: " + count);
	}
}