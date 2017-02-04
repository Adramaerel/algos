import java.util.Scanner;

public class P10110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ligne = "";
		while(!(ligne = sc.nextLine()).equals("0")) {
			Long nb = Long.parseLong(ligne);
			Long sq = (long) Math.sqrt(nb);
			System.out.println(nb != sq * sq ? "no" : "yes");
		}
		sc.close();

	}

}

