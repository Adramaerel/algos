import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10783 {

	public static void main(String[] args) throws Exception {

		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		Integer nbTestCases = Integer.parseInt(entree.readLine());

		for(int i = 0; i < nbTestCases; i ++) {
			int sum = 0;
			int entier1 =Integer.parseInt(entree.readLine());
			int entier2 = Integer.parseInt(entree.readLine());
			int start = entier1, stop = entier2;
			if(entier1 % 2 == 0) {
				start++;
			}
			if(entier2 % 2 == 0) {
				stop --;
			}
			
			for(int j = start; j <= stop; j = j + 2) {
				sum += j;
			}
			
			System.out.println("Case " + (i+1) + ": " + sum);
		}
	}
}



