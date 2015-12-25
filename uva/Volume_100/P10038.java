import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10038 {
	
	static class CheckTab {
		int nb = 0;
		boolean b = false;;
	}
	
	public static void main(String[] args) throws Exception {
		
		
		
		String ligne;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		while((ligne = entree.readLine()) != null) {
			String []tabEntree = ligne.split(" ");
			int nbCases = Integer.parseInt(tabEntree[0]);
			
			CheckTab checkTab [] = new CheckTab[nbCases];
			for(int i = 0; i < nbCases; i ++) {
				checkTab[i] = new CheckTab();
				checkTab[i].nb = i;
			}
			
			if(calculateJolly(tabEntree, checkTab)) {
				System.out.println("Jolly");
			} else {
				System.out.println("Not jolly");
			}
			
		}
		System.exit(0);
	}

	private static Boolean calculateJolly(String[] tabEntree, CheckTab []checkTab) {
		int sum = 0;
		
		if(tabEntree.length == 2) {
			return true; 
		}
		
		for(int i = 2; i < tabEntree.length; i++) {
			sum = Math.abs(Integer.parseInt(tabEntree[i]) - Integer.parseInt(tabEntree[i - 1]));
			if(sum >= checkTab.length) {
				return false;
			}
			if(checkTab[sum].b) {
				return false;
			}
			checkTab[sum].b = true;
		}
		return true;
	}

}

