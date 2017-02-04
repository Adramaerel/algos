 

import java.util.Scanner;
public class P494 {

	public static void main (String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			boolean debutMot = false;
			int count = 0;
			char[] mots =  sc.nextLine().toCharArray();
			for (char lettre : mots) {
				if(Character.isLetter(lettre)) {
					if(!debutMot) {
						count++;
						debutMot = true;
					}
				}
				else {
					debutMot= false;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}

