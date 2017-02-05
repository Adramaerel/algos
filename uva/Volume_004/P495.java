import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P495 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<BigInteger> list = new ArrayList<>();
		list.add(BigInteger.ZERO);
		list.add(BigInteger.ONE);
		for(int i = 2; i <= 5000; i++) {
			BigInteger bi = BigInteger.ZERO;
			list.add(bi.add(list.get(i - 1)).add(list.get(i - 2)));
		}
		
		while(sc.hasNext()) {
			Integer i = Integer.parseInt(sc.nextLine());
			System.out.println("The Fibonacci number for " + i + " is " + list.get(i));
			
		}
		sc.close();
	}

}
