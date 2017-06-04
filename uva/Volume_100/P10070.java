import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ethardolind
 *
 */
public class P10070 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BigInteger year;
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()) {
			
			Boolean isLeap = false;
			Boolean isBulukulu = false;
			Boolean isHuluculu = false;
			year = new BigInteger(sc.nextLine());
			if(((year.mod(new BigInteger("4")) == BigInteger.ZERO) 
					&& (year.mod(new BigInteger("100")) != BigInteger.ZERO))
					|| (year.mod(new BigInteger("400")) == BigInteger.ZERO)) {
				isLeap = true;
				if(year.mod(new BigInteger("55")) == BigInteger.ZERO) {
					isBulukulu = true;
				}
			}
			if(year.mod(new BigInteger("15")) == BigInteger.ZERO) {
				isHuluculu = true;
			}	

			if(isLeap) {
				sb.append("This is leap year.\n");
			}


			if(isHuluculu)
			{
				sb.append("This is huluculu festival year.\n");
			}
			if(isBulukulu)
			{
				sb.append("This is bulukulu festival year.\n");
			}


			if(isLeap == false && isHuluculu == false && isBulukulu == false)
			{
				sb.append("This is an ordinary year.\n");
			}
			sb.append("\n");

			
		}
		System.out.print(sb.substring(0, sb.length() - 1));
		sc.close();
	}

}
