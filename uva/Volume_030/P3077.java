import java.util.Scanner;

/**
 * icpcarchive.ecs.baylor.edu problem 3077 in Java - No Brainer 
 * @author Ethardolind
 *
 */
public class P3077 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nb = Integer.parseInt(sc.nextLine().trim());
		for(int i = 0; i < nb; i++) {
			String ligne = sc.nextLine();
			String [] tab = ligne.split(" ");
			int nb1 = Integer.parseInt(tab[0]);
			int nb2 = Integer.parseInt(tab[1]);
			System.out.println(nb1 < nb2 ? "NO BRAINS" : "MMM BRAINS");
			
		}
		
		sc.close();
	}

}
