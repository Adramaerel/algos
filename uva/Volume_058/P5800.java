package uva.p058;

import java.util.Scanner;

public class P5800 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int nb = Integer.parseInt(sc.nextLine().trim());
		for(int i = 0; i < nb; i++) {
			String []input = sc.nextLine().split(" ");
			input[2] = input[2].trim();
			int j = Integer.parseInt(input[1].trim());
			System.out.print(input[0] + " ");
			for(int l = 0; l < input[2].length(); l++) {
				for(int k = 0; k < j; k++) {
					System.out.print(input[2].charAt(l));
					}
			}
			System.out.println();
		}
		
	}

}

