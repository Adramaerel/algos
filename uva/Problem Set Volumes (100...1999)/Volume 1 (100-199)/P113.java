import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P113 {
	
	public static void main (String ... args) throws Exception {
		String ligne;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		
		while((ligne = entree.readLine()) != null) {
			double n = Double.parseDouble(ligne);
			double p = Double.parseDouble(entree.readLine());
			System.out.println(Math.round(Math.pow(p, 1.0/n)));
		}
		
	}

}
