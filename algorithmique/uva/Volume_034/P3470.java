 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3470 {
	
	public static void main(String[] args) throws IOException {
		String ligne;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		while(!(ligne = entree.readLine()).equals("0 0")) {
			
			String [] input = ligne.split(" ");
			Integer nbDiners = Integer.parseInt(input[0]);
			Integer nbStudents = Integer.parseInt(input[1]);
			Integer tab [] [] = new Integer[nbDiners][nbStudents];
			for (int i = 0; i < nbStudents; i++) {
				input = entree.readLine().split(" ");
				for(int j = 0; j < nbDiners; j++) {
					tab[j][i] = Integer.parseInt(input[j]);
				}
			}
			
			Boolean yes = false;
			for(int i = 0; i < nbDiners; i++) {
				int sum = 0;
				for(int j = 0; j < nbStudents; j++) {
					sum += tab[i][j];
				}
				if(sum == nbStudents) {
					yes = true; break;
				}
			}
			
			if(yes) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
			
		}
	}

}

