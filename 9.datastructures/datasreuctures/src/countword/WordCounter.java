package countword;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 Map<String, Integer> words = new HashMap<>();
		 
		 for (int i = 0; i < 20; i++) {
			 System.out.print("Enter word: ");
			 String word = s.next();
			 int count = 0;
			 
			 if (words.containsKey(word)) {
				 count = words.get(word);
			 }
			 
			 words.put(word, count + 1);
		 }
		 
		 s.close();
		 

		 for (String word : words.keySet()) {
			 System.out.println(word + ": " + words.get(word));
		 }
	}

}

	