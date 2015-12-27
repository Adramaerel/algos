
import java.util.Scanner;

public class P12372 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer casesNb = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= casesNb; i++) {
			int l1 = sc.nextInt();
			int l2 = sc.nextInt();
			int l3 = sc.nextInt();
			if(l1 <= 20 && l2 <= 20 && l3 <= 20) {
				System.out.println("Case " + i + ": good");
			} else {
				System.out.println("Case " + i + ": bad");
			}
				
		}
		
	}

}

