import java.util.Scanner;

public class P10189 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ligne;
		int i = 0;
		while(!(ligne = sc.nextLine()).equals("0 0")) {
			i++;
			String [] coord = ligne.split(" ");
			int x = Integer.parseInt(coord[1]);
			int y = Integer.parseInt(coord[0]);
			String [][] jeu = new String[x][y];

			for(int ligneNb = 0; ligneNb < y; ligneNb ++) {
				String s = sc.nextLine();

				for(int caseNb = 0; caseNb < x; caseNb++) {
					jeu[caseNb][ligneNb] = "" + s.charAt(caseNb);
				}
			}
			if(i > 1) {
				System.out.println();
			}
			System.out.println("Field #" + i + ":");
			for(int ligneNb = 0; ligneNb < y; ligneNb ++) {
				for(int caseNb = 0; caseNb < x; caseNb++) {
					if(jeu[caseNb][ligneNb].equals("*")) {
						System.out.print("*");
					} else {
						System.out.print(calcul(jeu, caseNb, ligneNb));
						if(ligneNb == y - 1 && caseNb == x - 1) {

						}

					}
				}
				if(sc.hasNext())  {
					System.out.println();
				}
			}

		}
		sc.close();

	}

	private static int calcul(String[][] jeu, int caseNb, int ligneNb) {
		int sum = 0;
		for(int x = caseNb - 1; x <= caseNb + 1; x++) {
			for(int y = ligneNb - 1; y <= ligneNb + 1; y++) {
				if(x == caseNb && y == ligneNb) {
					continue;
				}
				String s;
				try {
					s = jeu[x][y];
					if(s.equals("*")) sum++;
				} catch(ArrayIndexOutOfBoundsException e) {
					continue;
				}
			}
		}
		return sum;
	}

}

