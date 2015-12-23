
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11185 {


	public static void main(String[] args) throws Exception {

		String ligne;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		while(!(ligne = entree.readLine()).contains("-")) {
			Integer input = Integer.parseInt(ligne);
			String enBase3 = "";
			while(input != 0) {

				int reste = input %3;

				enBase3 = Math.abs(reste) + enBase3;
				input = input /3;
			}
			if(enBase3.equals("")) {
				System.out.println(0);
			} else
				System.out.println(enBase3);	



		}
	}

}

