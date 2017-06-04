import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Ethardolind
 *
 */
public class P748 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String []tab = sc.nextLine().split(" ");
			Double decimal1 = Double.parseDouble(tab[0]);
			BigDecimal decimal = new BigDecimal(decimal1 + "");
			Integer n = Integer.parseInt(tab[tab.length - 1]);

			String result = decimal.pow(n).toPlainString();
			if(result.startsWith("0.")) {
				result = result.substring(1, result.length());
			}
			System.out.println(result);

			sc.close();


		}
	}

}
