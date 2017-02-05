import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P369 {

	public static void main(String[] args) {
		
		Map<Integer, BigInteger> mapFact = new HashMap<>();
		mapFact.put(0, BigInteger.ONE);
		mapFact.put(1, BigInteger.ONE);
		
		for(int i = 2; i <= 100; i++) {
			mapFact.put(i, mapFact.get(i - 1).multiply(new BigInteger("" + i)));
		}
		
		Scanner sc = new Scanner(System.in);
		int n,m;
		while(!(((n = sc.nextInt()) == (m = sc.nextInt())) && (n ==0))) {
			BigInteger solution = BigInteger.ONE.multiply(mapFact.get(n).divide(mapFact.get(n - m ).multiply(mapFact.get(m))));
			System.out.printf("%d things taken %d at a time is %s exactly.\n", n, m, solution.toString());
		}
		
		
		sc.close();

	}

}
