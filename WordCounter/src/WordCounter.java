
public class WordCounter {

	public static void countWords(String string) {

		String[] strArray = string.split(" ");
		int count = 0;
		for (String s : strArray) {
			if (!s.equals(" ")) {
				count++;
			}

		}
		System.out.println("Total words: " + count);
		
		
	}
}
