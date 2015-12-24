package uva;

import java.util.Arrays;
import java.util.Scanner;

public class P11854 {

	public static void main(String[] args) throws Exception {

		Scanner sc =new Scanner(System.in);
		int[] side = new int[3];
		Integer [] inputInt = new Integer[3];
		while(sc.hasNext()) {

			for(int i =0; i < inputInt.length; i ++) {
				inputInt[i] = sc.nextInt();
			}
			
			if(inputInt[0] == 0 && inputInt[1] == 0 && inputInt[2] == 0) {
				System.exit(0);
			}
			
			Arrays.sort(inputInt);
			if(inputInt[2] * inputInt[2] == inputInt[1] * inputInt[1]+ inputInt[0] * inputInt[0]) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		System.exit(0);
	}

}

