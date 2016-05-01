import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P382 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer integer;
		System.out.println("PERFECTION OUTPUT");
		while(!(integer = sc.nextInt()).equals(0)) {
			List<Integer> diviseurs = new ArrayList<Integer>();
			for(int i = 1; i < integer; i++) {
				if(integer  % i == 0) {
					diviseurs.add(i);
				}
			}
			Integer sum  = diviseurs.stream().mapToInt(c -> c).sum();
			
			
			String integer2 = formatInteger(integer);
			if(integer == 1 || sum < integer) {
				System.out.println(integer2 + "  DEFICIENT");
			} else if(sum.equals(integer)) {
				System.out.println(integer2 + "  PERFECT");
			} else {
				System.out.println(integer2 + "  ABUNDANT");
			}
			

		}
		System.out.println("END OF OUTPUT");


	}

	private static String formatInteger(Integer integer) {
		String s = integer.toString();
		for(int i = integer.toString().length(); i < 5; i ++) {
			s = " " + s;
		}
		return s;
	}

}

