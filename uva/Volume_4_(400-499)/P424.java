import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P424 {

	public static void main(String[] args) {
		
		BigInteger result = new BigInteger("" + 0);
		
		try {
			BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
			String ligne = "";
			while(!(ligne = entree.readLine()).equals("0")) {
				BigInteger tmp = new BigInteger(ligne);
				result = result.add(tmp);
			}
		} catch(Exception e) {

		}
		
		System.out.println(result.toString());
		
	}

}

