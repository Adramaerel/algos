
import java.util.Arrays;
import java.util.Scanner;

public class P11875 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer cNb = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < cNb; i++) {
			String [] tab = sc.nextLine().split(" ");
			Integer input [] = new Integer[tab.length - 1];
			for(int j = 0; j < input.length;j++) {
				input[j] = Integer.parseInt(tab[j + 1]);
			}
			Arrays.sort(input);
			System.out.printf("Case %d: %d\n", i +1, (int)input[input.length / 2]);
		}
		sc.close();
	}

}

