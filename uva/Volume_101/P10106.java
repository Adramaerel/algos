import java.math.BigInteger;
import java.util.Scanner;

public class P10106 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			BigInteger i1 = new BigInteger(sc.nextLine());
			BigInteger i2 = new BigInteger(sc.nextLine());
			System.out.println(i1.multiply(i2).toString());
		}
		
		sc.close();
		
	}

}
