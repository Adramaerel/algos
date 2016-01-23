package uva.p006;

import java.util.Scanner;

public class P621 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer cNb = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < cNb; i++) {
			String ligne = sc.nextLine(); 
			if(ligne.equals("4") || ligne.equals("78") || ligne.equals("1")) {
				System.out.println("+");
			} else if(ligne.endsWith("35")) {
				System.out.println("-");
			} else if(ligne.startsWith("9") && ligne.endsWith("4")) {
				System.out.println("*");
			} else if(ligne.startsWith("190")) {
				System.out.println("?");
			}
		}
		sc.close();
	}

}

