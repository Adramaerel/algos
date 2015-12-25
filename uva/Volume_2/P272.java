import java.io.BufferedReader;
import java.io.InputStreamReader;



public class P272 {

	public static void main(String[] args) throws Exception {
		
		String ligne;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		Boolean first = true;
		String firstQuotes = "``";
		String secondQuotes = "''";
		while((ligne = entree.readLine()) != null) {
			while(ligne.contains("\"")) {
				if(first) {
					ligne = ligne.replaceFirst("\"", firstQuotes);
					
				} else {
					ligne = ligne.replaceFirst("\"", secondQuotes);
				}
				first = !first;
			}
			System.out.println(ligne);
		}
		System.exit(0);

	}

}

