package kyu8;

public class JadenCase {
	
	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.isEmpty())
			return null;
		else {
			String result = "";
			String[] words = phrase.split(" ");
			for (int i = 0; i < words.length; i++) {
				result += capitalize(words[i]);
				if (i < words.length -1)
					result += " ";
			}
			return result;
		}
	}
	
	private String capitalize(String word) {
		return word.replace(word.charAt(0), word.toUpperCase().charAt(0));
	}

}
