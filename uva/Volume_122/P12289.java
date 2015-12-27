

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int casesNb = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < casesNb; i++) {
			String ligne = sc.nextLine();

			if(ligne.length() == 5) {
				System.out.println(3);
			} else {
				if(ligne.charAt(0) == 'o' && ligne.charAt(1)  == 'n') {
					System.out.println(1);
				} else
					if(ligne.charAt(1) == 'n' && ligne.charAt(2)  == 'e') {
						System.out.println(1);
					} else 
						if(ligne.charAt(0) == 'o' && ligne.charAt(2)  == 'e') {
							System.out.println(1);
						}

				if(ligne.charAt(0) == 't' && ligne.charAt(1)  == 'w') {
					System.out.println(2);
				} else
					if(ligne.charAt(1) == 'w' && ligne.charAt(2)  == 'o') {
						System.out.println(2);
					} else 
						if(ligne.charAt(0) == 't' && ligne.charAt(2)  == 'o') {
							System.out.println(2);
						}


			}
		}

	}

}

