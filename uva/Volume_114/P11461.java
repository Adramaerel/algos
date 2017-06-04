import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ethardolind
 *
 */
public class P11461 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer i1 = 0;
		Integer i2 = 0;

		List<Integer> list = new ArrayList<>(); 

		for(int i = 0; i < 317; i++) { // 317  ² = 100000
			list.add(i*i);
		}

		Scanner sc = new Scanner(System.in);
		String ligne = "";
		while(!(ligne = sc.nextLine()).equals("0 0")) {
			i1 = Integer.parseInt(ligne.split(" ")[0]);
			i2 = Integer.parseInt(ligne.split(" ")[1]);

			int bornesup = 0;
			int borneinf = 0;

			while(true) {
				if(list.contains(i2)) {
					bornesup = list.indexOf(i2);
					break;
				}
				i2--;
			}

			while(true) {
				if(list.contains(i1)) {
					borneinf = list.indexOf(i1);
					break;
				}
				i1++;
			}
			System.out.println(bornesup - borneinf + 1);
		}

		sc.close();


	}

}
