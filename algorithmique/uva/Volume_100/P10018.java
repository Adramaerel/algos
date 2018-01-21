
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10018 {

	public static void main(String[] args) throws Exception {

		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		Integer nbCases = Integer.parseInt(entree.readLine());

		for (int i = 0; i < nbCases; i++) {
			Long input = Long.parseLong(entree.readLine());
			int j = 0;
			do {
				input = reverseAndAdd(input);
				j++;
			} while(!testPalindrome(input));
			System.out.println(j + " " + input);

		}

	}

	private static Long reverseAndAdd(Long input) {
		String inputString = "" + input;
		String reverseString = "";
		for(int i = 0 ; i < inputString.length(); i++) {
			reverseString += inputString.charAt(inputString.length() -i - 1);
		}
		Long reverseInteger = Long.parseLong(reverseString);

		return reverseInteger + input;
	}

	private static boolean testPalindrome(Long input) {
		String inputString = "" + input;

		for(int i = 0; i < (inputString.length() + 1)/2; i++) {
			if (!(inputString.charAt(i) 
					== inputString.charAt(inputString.length() - i - 1))) {
				return false;
			}
		}
		return true;
	}

}

