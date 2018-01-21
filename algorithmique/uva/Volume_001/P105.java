import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * The Skyline problem.
 * https://uva.onlinejudge.org
 * Problem #105
 * @author Adramaerel
 *
 */
class Triplet {
	public int x = 0;
	public int y = 0;
	public int z = 0;
	public boolean isNull() {
		return x == 0 && y == 0 && z == 0;
	}
}
public class P105 {

	public static void main(String[] args) throws Exception {
		
		List<Triplet> list = new ArrayList<>();

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = bi.readLine()) != null) {
			Triplet triplet = new Triplet();
			String []str = line.split("\\s");
			triplet.x = Integer.parseInt(str[0]);
			triplet.y = Integer.parseInt(str[1]);
			triplet.z = Integer.parseInt(str[2]);
			list.add(triplet);

		}
		

		List <Triplet> map = new ArrayList<>();

		int max_abs = 0;
		for(Triplet triplet : list) {
			max_abs = (max_abs < triplet.z) ?  triplet.z : max_abs;   
		}
		for(int i = 0; i <= max_abs; i++) {
			Triplet triplet  = new Triplet();
			triplet.x = i;
			map.add(triplet);
		}
		
		for (Triplet triplet : list) {
			for(int j = triplet.x; j < triplet.z; j++) {

				Triplet tripletCourant = map.get(j);

				if(tripletCourant.y == 0 || tripletCourant.y < triplet.y)  {
					tripletCourant.y = triplet.y;
				} 
			}
		}
		

		printSolution(map);

	}

	private static void printSolution(List<Triplet> map) {

		Triplet triplet = null;
		while(true) { // eliminer les premieres abscisses où il n'y a pas de bâtiment
			if((triplet = map.remove(0)).y == 0) {

			} else {
				map.add(0, triplet);
				break;
			}
		}
		triplet = map.remove(0);
		System.out.printf("%d %d", triplet.x, triplet.y);
		int y = triplet.y;
		while(true) {
			try  {
				triplet = map.remove(0);
			} catch(IndexOutOfBoundsException e) {
				break;
			}

			if(y == triplet.y) {
				continue;
			} else {
				y = triplet.y;
				System.out.printf(" %d %d", triplet.x, triplet.y);
			}
		}
		System.out.println();

	}

}
