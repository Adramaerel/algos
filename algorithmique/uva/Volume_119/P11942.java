
import java.util.Scanner;

public class P11942 {
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Integer casesNb = Integer.parseInt(sc.nextLine());
		Integer [] tab = new Integer[10];
		boolean testCroissant;
		System.out.println("Lumberjacks:");
		for(int j = 0; j < casesNb; j++) {
			String [] ligne = sc.nextLine().split(" ");
			for(int i = 0; i < 10; i++) {
				tab[i] = Integer.parseInt(ligne[i]);
			}
			testCroissant = tab[1] > tab[0] ? true : false;
			String result = "Ordered";
			for(int k = 1; k < 10; k++) {
				if((testCroissant && (tab[k] < tab[k - 1])) || (!testCroissant && (tab[k] > tab[k - 1]))) {
					result = "Unordered";
					break;
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

}

