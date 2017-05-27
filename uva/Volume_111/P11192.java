import java.util.Scanner;

/**
 * 
 */

/**
 * Group reverse - uva online judge
 * @author Ethardolind
 *
 */
public class P11192 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ligne;
		StringBuilder sb = new StringBuilder();
		while(!(ligne = sc.nextLine()).equals("0")) {
			String [] tab = ligne.split(" ");
			Integer testCaseNb = Integer.parseInt(tab[0]);
			String string = tab[1];
			for (int i = 0; i <  testCaseNb; i++ ) {
				String stringToReverse = string.substring(i * (string.length() /testCaseNb), i * (string.length() /testCaseNb) + (string.length() /testCaseNb));
				for(int j = stringToReverse.length() -1; j >= 0; j--) {
					sb.append(stringToReverse.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
