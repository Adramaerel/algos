 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class P10370 {
	
	
	public static void main(String[] args) throws Exception {
		
 		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		Integer nbCases = Integer.parseInt(entree.readLine());
		for(int i = 0; i < nbCases; i++) {
			String [] tab = entree.readLine().split(" ");
			double moyenne = calculMoyenne(tab);
			int countAbove = 0;
			for(int j = 1; j < tab.length; j++) {
				if(Integer.parseInt(tab[j]) > moyenne) {
					
					countAbove++;
				}
			}
			
			
			double pourcentage = (double)countAbove / (tab.length - 1) * 100;
			NumberFormat nf = new DecimalFormat("0.000");
			String s = nf.format(pourcentage);
			System.out.println(s + "%");
		}
		
	}

	private static double calculMoyenne(String[] tab) {
		int sum = 0;
		for(int i = 1; i < tab.length; i++) {
			sum += Integer.parseInt(tab[i]);
		}
		return sum / (tab.length - 1);
	}



}

