package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class P10008 {


	public static void main(String... args) throws Exception{
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

		Integer nbCases = Integer.parseInt(entree.readLine());

		Integer [] tabCharCount = new Integer[26];

		Character [] tabChar2 = new Character[26];

		for(int i = 0; i < tabCharCount.length; i++) {
			tabCharCount[i] = 0;
			tabChar2[i] = (char) ('A' + i); 
		}

		for(int i = 0; i < nbCases; i ++) {
			String ligne = entree.readLine();
			ligne = ligne.toUpperCase();
			for(int j = 0; j < ligne.length(); j++) {
				char c = ligne.charAt(j);
				if(c >= 'A' && c <= 'Z') {
					tabCharCount[c - 'A']++;
				}
			}


		}
		for(int j = 0; j < tabCharCount.length - 1; j++)
			for(int i = 0; i < tabCharCount.length - 1; i++) {
				if(tabCharCount[i] < tabCharCount [i + 1]) {
					int switchValue = tabCharCount [i + 1];
					tabCharCount [i + 1] = tabCharCount [i];
					tabCharCount [i] = switchValue;
					Character c = tabChar2[i + 1];
					tabChar2[i + 1] = tabChar2[i];
					tabChar2[i] = c;


				}
			}


		for(int i = 0; i < tabCharCount.length; i ++) {
			if(tabCharCount[i] > 0) {
				System.out.print(tabChar2[i]);
				System.out.println(" " + tabCharCount[i]);
			}
		}
		System.exit(0);
	}

}

