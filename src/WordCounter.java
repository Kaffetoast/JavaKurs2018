
public class WordCounter {

	public static int countWords (String string) {
		String[] strArray = string.split(" ");
		int count = 0;
		for (String s : strArray) {
			if (!s.equals(" "))
			{
				count++;
			}

		}
		return count;

	}
}
