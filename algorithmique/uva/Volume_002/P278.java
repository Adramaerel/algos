import java.util.Scanner;

public class P278 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer casesNb = Integer.parseInt(sc.nextLine());

		while(casesNb > 0) {
			casesNb--;
			char piece = sc.next(".{1}").charAt(0);
			int m = sc.nextInt();
			int n = sc.nextInt();
			sc.nextLine();

			switch(piece) {
			case 'r':
				System.out.println(Math.min(n,m));
				break;
			case 'k':
				System.out.println(((m + 1)/2) * ((n + 1)/2) + ((m/2) * (n/2)));
				break;
			case 'Q':
				System.out.println(Math.min(n,m));
				break;
			case 'K':
				System.out.println(((m + 1)/2) * ((n+1) /2));
				break;
			}

		}
		sc.close();
	}

}

