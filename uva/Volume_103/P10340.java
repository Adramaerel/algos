import java.util.Scanner;

/**
 * https://uva.onlinejudge.org problem 10340 in Java - All in All.
 * @author Adramaerel
 *
 */
public class P10340 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String ligne = sc.nextLine();
			String s = ligne.split(" ")[0];
			String t = ligne.split(" ")[1];
			boolean ok = false;
			int index = 0;
			int i = 0;
			while((index = findfirstStartingFrom(s.charAt(i), index, t)) != -1) {
				i++; index++;
				if(i == s.length()) {
					ok = true;
					break;
				}

			}
			System.out.println(ok ? "Yes" : "No");
		}
		sc.close();

	}

	static int findfirstStartingFrom(char caracter, int index, String t) {
		for(int i = index; i < t.length(); i++) {
			if(t.charAt(i) == caracter) {
				return i;
			}
		}
		return -1;
	}

}
