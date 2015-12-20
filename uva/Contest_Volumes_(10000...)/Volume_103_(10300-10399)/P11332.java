
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P11332 {

	public static void main(String[] args) throws Exception {

		String ligne;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		while(!(ligne = entree.readLine()).equals("0")) {
			Integer integer = Integer.parseInt(ligne);
			while(integer > 9) {
				integer = sumOfDigits(integer);
			}
			System.out.println(integer);
		}

	}

	private static Integer sumOfDigits(Integer integer) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		while(integer > 0) {
			sum += integer % 10;
			integer /= 10;
		}
		
		return sum;
	}

}



