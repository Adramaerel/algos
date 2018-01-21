import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ethardolind
 *
 */
public class P10323 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, BigInteger> map = new HashMap<>();

		BigInteger previous = BigInteger.ONE;
		map.put(new Integer(0), BigInteger.ONE);
		map.put(new Integer(1), BigInteger.ONE);

		for (int i = 2; i < 14; i++) {

			map.put(new Integer(i), previous.multiply(new BigInteger(i + "")));
			previous = previous.multiply(new BigInteger(i + ""));
		}

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			Integer i = Integer.parseInt(sc.nextLine());

			if(i <= 0) {
				if( i %2 == 0) {
					System.out.println("Underflow!");
				} else {
					System.out.println("Overflow!");
				}

			}
			if (i > 0 && i < 8 ) {
				System.out.println("Underflow!");
			}
			if( i >= 8 && i < 14) {
				System.out.println(map.get(new Integer(i)));
			}
			if( i >= 14 ) {
				System.out.println("Overflow!");
			}
		}
		sc.close();
	}
}
