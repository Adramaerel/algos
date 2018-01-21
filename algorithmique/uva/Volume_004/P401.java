

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P401 {

	public static Map<String, String> map;

	static {
		map = new HashMap<String, String>();
		map.put("A", "A");
		map.put("E", "3");
		map.put("3", "E");
		
		map.put("H", "H");
		
		map.put("I", "I");
		
		map.put("J", "L");
		map.put("L", "J");
		map.put("M", "M");
		
		map.put("O", "O");
		
		map.put("S", "2");
		map.put("2", "S");
		
		map.put("T", "T");
		map.put("U", "U");
		map.put("V", "V");
		
		map.put("W", "W");
		map.put("X", "X");
		map.put("Y", "Y");
		
		map.put("Z", "5");
		map.put("5", "Z");
		map.put("1", "1");
		map.put("8", "8");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String ligne = sc.nextLine();
			Boolean palindrome = testPalindrome(ligne);
			Boolean mirroredString = testMirroredString(ligne);

			if(palindrome && mirroredString) {
				System.out.println(ligne + " -- is a mirrored palindrome.\n");
			}

			if(!palindrome && mirroredString) {
				System.out.println(ligne + " -- is a mirrored string.\n");
			}

			if(palindrome && !mirroredString) {
				System.out.println(ligne + " -- is a regular palindrome.\n");
			}

			if(!palindrome && !mirroredString) {
				System.out.println(ligne + " -- is not a palindrome.\n");
			}
		}
		sc.close();
	}

	private static Boolean testMirroredString(String ligne) {
		
		for(int i = 0; i < ligne.length(); i++) 
			if(!("" + ligne.charAt(i)).equals(map.get("" + ligne.charAt(ligne.length() -i - 1)))) 
				return false;
		return true;
	}

	private static Boolean testPalindrome(String ligne) {

		for(int i = 0; i < ligne.length(); i++) 
			if(ligne.charAt(i) != ligne.charAt(ligne.length() -i - 1)) 
				return false;
		return true;
	}

}

