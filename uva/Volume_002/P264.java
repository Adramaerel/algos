import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * https://uva.onlinejudge.org problem 264 in Java - Count on Cantor.
 * @author Adramaerel
 *
 */
public class P264 {

	public static void main(String[] args) {
		

		List<Integer> list1 = new ArrayList<>(10_000_000);
		List<Integer> list2 = new ArrayList<>(10_000_000);
		boolean isUp1 = false;
		boolean isUp2 = true;
		int max1 = 1;
		int max2 = 1;
		int current1 = 1;
		int current2 = 1;

		for(int i = 1; i < 20_000_002; i++) {
			if(isUp1) {
				current1 = 1;
				while(current1 <= max1) {
					list1.add(current1);
					current1++;
					i++;
				}
				isUp1 = !isUp1;

			} else {
				current1 = max1;
				while(current1 >=1 ) {
					list1.add(current1);
					current1 --;
					i++;
				}
				isUp1 = !isUp1;
			}
			max1++; 


			if(isUp2) {
				current2 = 1;
				while(current2 <= max2) {
					list2.add(current2);
					current2++;
					i++;
				}
				isUp2 = !isUp2;

			} else {
				current2 = max2;
				while(current2 >=1 ) {
					list2.add(current2);
					current2 --;
					i++;
				}
				isUp2 = !isUp2;
			}
			max2++; 

		}

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			Integer i = Integer.parseInt(sc.nextLine());
			System.out.printf("TERM %d IS %d/%d\n", i--, list1.get(i), list2.get(i));
		}
		sc.close();
		
	}
}