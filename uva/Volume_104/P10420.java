
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Pair implements Comparable<Pair>{

	public Pair(String country)  {
		this.country = country;
		nb = 1;
	}

	int nb;
	String country;
	@Override
	public int compareTo(Pair o) {
		return this.country.compareTo(o.country);
	}
}

public class P10420 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer casesNb = Integer.parseInt(sc.nextLine());

		List<Pair> list = new ArrayList<Pair>();

		for(int i = 0; i < casesNb; i++) {
			String []input = sc.nextLine().split(" ");
			boolean found = false;
			for(Pair p : list) {
				if(p.country.equals(input[0])
						) {
					found = true;
					p.nb++;
				}

			}
			if(!found) {
				list.add(new Pair(input[0]));

			}
		}
		
		Collections.sort(list);
		for(Pair pair : list) {
			System.out.printf("%s %d\n", pair.country, pair.nb
					);
		}

	}

}

