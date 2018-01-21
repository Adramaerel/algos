

import java.math.BigInteger;
import java.util.Scanner;

public class P374 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger b, p, m;
		
		while(sc.hasNext()) {
			
			b = sc.nextBigInteger();
			p = sc.nextBigInteger();
			m = sc.nextBigInteger();
			
			System.out.println(b.modPow(p, m));
			
		}
		sc.close();
	}

}

