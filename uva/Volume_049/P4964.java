
import java.util.Scanner;

public class P4964 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String ligne = sc.nextLine();
			String [] tab = ligne.split(" ");
			Integer tab2 [] = new Integer[3];
			tab2[0] = Integer.parseInt(tab[0]);
			tab2[1] = Integer.parseInt(tab[1]);
			tab2[2] = Integer.parseInt(tab[2]);
			
			if(tab2[0] == 0 && tab2[1] == 0 && tab2[2] == 0) {
				break;
			}
			Integer r1 = tab2[1] - tab2[0];
			boolean b;
				System.out.printf((b = r1 == (tab2[2] - tab2[1])) ? "AP %d\n" : "GP %d\n", b ? tab2[2] + r1 : tab2[2] * tab2[1] / tab2[0]);
		}
		
	}

}

