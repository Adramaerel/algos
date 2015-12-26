package uva.p108;

import java.util.Scanner;

public class P10812 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer casesNb = sc.nextInt();
		for(int i = 0; i < casesNb; i++) {
			int sum = sc.nextInt();
			int diff = sc.nextInt();
			int potential_X = (diff + sum)/2;
			int potential_Y = sum - potential_X;
			
			if((potential_X + potential_Y != sum) || (Math.abs(potential_X - potential_Y)) != diff) {
				System.out.println("impossible");
				continue;
			}
			
			if((sum + diff) % 2 != 0 || (sum - diff) % 2 != 0) {
				System.out.println("impossible");
				continue;
			}
			
			if(potential_X >= 0 && potential_Y >= 0) {
				if(potential_X > potential_Y) {
					System.out.println(potential_X + " " + potential_Y);
				} else {
					System.out.println(potential_Y + " " + potential_X);
				}
			} else {
				System.out.println("impossible");
			}
			
		}
	}

}

