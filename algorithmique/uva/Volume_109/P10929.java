

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P10929 {

	public static void main(String[] args) throws Exception {

		String ligne;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		while(!(ligne = entree.readLine()).equals("0")) {
			ligne = ligne.trim();
			BigInteger bigint = new BigInteger(ligne);
			if(bigint.mod(new BigInteger("11")).equals(BigInteger.ZERO)) {
				System.out.println(ligne + " is a multiple of 11.");
			} else {
				System.out.println(ligne + "is not a multiple of 11.");
			}
		}
		
	}

}

