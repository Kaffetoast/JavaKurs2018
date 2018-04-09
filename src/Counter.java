public class Counter {

	public static void countWords(String wordcount) {

		if (!wordcount.isEmpty()) {

			String[] strArray = wordcount.split(" ");
			int count = 0;
			for (String s : strArray) {
				if (!s.equals(" ")) {
					count++;
				}

			}
			System.out.println("Total words: " + count);
		}

	}

	public static void countLetters(String lettercount) {

		if (!lettercount.isEmpty()) {

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
	
	public static void countLettersAndWords(String sentence) {
		
		countWords(sentence);
		countLetters(sentence);
	}
}
