import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P623 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

		String ligne;
		while((ligne = entree.readLine()) != null) {
			BigInteger calc = new BigInteger(ligne);
			BigInteger result = calculate(calc);
			System.out.println(ligne + "!");
			System.out.println(result);
		}
	}

	private static BigInteger calculate(BigInteger calc) {
		if(calc.equals(BigInteger.ONE) || calc.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		} else {
			return calc.multiply(calculate(calc.subtract(BigInteger.ONE)));
		}
	}

}

