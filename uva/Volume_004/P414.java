import java.util.Scanner;

public class P414 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String ligne;
		while(!(ligne = sc.nextLine()).equals("0")) {
			
			int maxX = 0;
			Integer []totalXCOunt = new Integer[Integer.parseInt(ligne)];
			for(int i = 0; i < Integer.parseInt(ligne); i++) {
				String ligneCourante = sc.nextLine();
				String x [] = ligneCourante.split(" ");
				int nbXCourant;
				if(x.length == 1) {
					nbXCourant = 25;
				} else {
					nbXCourant = x[0].length() + x[x.length - 1].length();
				}
				if(maxX < nbXCourant) {
					maxX = nbXCourant;
				}
				totalXCOunt[i] = nbXCourant;
			}
			int result = 0;
			for(int i = 0; i < totalXCOunt.length; i++) {
				result += maxX - totalXCOunt[i];
			}
			System.out.println(result);
		}
		
	}

}

