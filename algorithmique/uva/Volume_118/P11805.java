import java.util.Scanner;


/**
 * @author Ethardolind
 *
 */
public class P11805 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer testCaseNb = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCaseNb;) {
			String []tab = sc.nextLine().split(" ");
			int nb = (Integer.parseInt(tab[2]) %  Integer.parseInt(tab[0]) + Integer.parseInt(tab[1])) % Integer.parseInt(tab[0]);
			if(nb == 0) {
				nb = Integer.parseInt(tab[0]);
			}
			System.out.printf("Case " + (++i) + ": %d\n", nb);
		}
		sc.close();
	}

}
