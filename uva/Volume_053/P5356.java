import java.math.BigDecimal;
import java.util.Scanner;

public class P5356 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String ligne = sc.nextLine();
			BigDecimal bd = new BigDecimal(ligne.split(" ")[0]);
			Integer integer = Integer.parseInt(ligne.split(" ")[ligne.split(" ").length - 1]);
			String s = bd.pow(integer).toPlainString();
			s = removeTrailingZeros(s);
			s = removeFirstZero(s);
			System.out.println(s);
			
		}
	}

	private static String removeFirstZero(String s) {
		return s.startsWith("0") ? s.substring(1, s.length()) : s;
	}

	private static String removeTrailingZeros(String s) {
		while(s.endsWith("0")) {
			s = s.substring(0, s.length() - 1);
		}
		return s;
	}
	
	
	
	
}
