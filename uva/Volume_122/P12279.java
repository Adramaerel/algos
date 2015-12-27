
import java.util.Scanner;

public class P12279 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer testNb;
		int j = 1;
		while((testNb = sc.nextInt()) != 0) {
			int count = 0;
			for(int i = 0; i < testNb; i++) {
				Integer currentInt = sc.nextInt();
				if(currentInt != 0) {
					count++;
				} else {
					count--;
				}
			}
			System.out.println("Case " + j + ": " + count);
			j++;
		}
		
	}

}

