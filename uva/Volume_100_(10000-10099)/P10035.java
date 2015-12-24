package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10035 {

	public static void main(String... args) throws Exception{

		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		String ligne;
		while(!(ligne = entree.readLine()).equals("0 0")) {

			int carryNb = 0;
			int retenue = 0;
			String integer1 = ligne.split(" ")[0];
			String integer2 = ligne.split(" ")[1];
			int min = Math.min(integer1.length(), integer2.length());
			int max = Math.max(integer1.length(), integer2.length());
			for(int i = min; i < max; i++) {
				integer1 = completeWith0(integer1, max);
				integer2 = completeWith0(integer2, max);
			}

			for(int i = max - 1; i > -1; i--) {
				Integer chiffre1 = Integer.parseInt("" + integer1.charAt(i));
				Integer chiffre2 = Integer.parseInt("" + integer2.charAt(i));
				int tmpsum = chiffre1 + chiffre2 + retenue;
				if(tmpsum >= 10) {
					carryNb++;
					retenue = tmpsum / 10;
				} else {
					retenue = 0;
				}
			}
			switch(carryNb) {
			case 0:
				System.out.println("No carry operation.");
				break;

			case 1:
				System.out.println("1 carry operation.");
				break;
			default:
				System.out.println(carryNb + " carry operations.");
				break;

			}
		}


	}

	private static String completeWith0(String integer, int max) {
		if(integer.length() < max) {
			integer = "0" + integer;
		}
		return integer;
	}
}

