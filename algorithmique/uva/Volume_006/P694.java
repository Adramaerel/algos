import java.util.Scanner;

public class P694 {
	
	private static long nextStep(long i) {
		if (i % 2 == 1) {
			return 3 * i + 1;
		}
		return i /2;
	}
	
	public static void main(String[] args) {
		
		long caseNb = 1;
		Scanner sc = new Scanner(System.in);
		String ligne;
		while(!(ligne = sc.nextLine()).startsWith("-1")) {
			String input [] = ligne.split(" ");
			long limite = Long.parseLong(input[1]);
			long n0 = Long.parseLong(input[0]);
			long n = n0;
			long compteur = 0;
			do {
				compteur++;
				if(n0 == 1) break;
				n0 = nextStep(n0);
			} while(n0 <= limite);
			System.out.printf("Case %d: A = %d, limit = %d, number of terms = %d\n", caseNb, n, limite, compteur);
			caseNb++;
		}
		
		sc.close();
	}

}

