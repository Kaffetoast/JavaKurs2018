
public class LetterCounter {

	public static int countLetters(String string) {
		char[] array = string.toCharArray();
		int count = 0;
		for (char c : array) {
			if (c != (' ')) {
				count++;
			}
		}
		return count;

	}
}