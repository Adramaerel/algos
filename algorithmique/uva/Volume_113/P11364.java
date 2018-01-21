
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P11364 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer casesNb = sc.nextInt();
		for(int i = 0; i < casesNb; i++) {
			Integer nbMagasins = sc.nextInt(); // nb magasins
			List<Integer> places = new ArrayList<Integer>();
			for(int j = 0; j < nbMagasins; j++) {
				places.add(sc.nextInt());
			}
			Integer barycentre = calculBarycentre(places, places.size() - 1) / places.size();
			Collections.sort(places);
			int dist = 0;
			dist += Math.abs(barycentre - places.get(0));
			dist += Math.abs(barycentre - places.get(places.size() - 1));
			for(int  j = 1; j <places.size(); j++) {
				dist += places.get(j) - places.get(j - 1);
			}
			System.out.println(dist);

		}
		sc.close();

	}
	/* ugly ! */
	private static Integer calculBarycentre(List<Integer> places, Integer i) {
		if(i == 0)
			return places.get(0);
		else  return places.get(i) + calculBarycentre(places, i - 1);

	}
}

