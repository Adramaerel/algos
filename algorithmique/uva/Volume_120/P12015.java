

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P12015 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer cNB = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= cNB; i++) {
			int max = 0;
			List<String> results = new ArrayList<String>();
			for(int j = 0; j < 10; j++) {
				String []input = sc.nextLine().split(" ");
				if(Integer.parseInt(input[1]) > max) {
					results.clear();
					results.add(input[0]);
					max = Integer.parseInt(input[1]);
				} else if (Integer.parseInt(input[1]) == max) {
					results.add(input[0]);
				}
			}
			System.out.printf("Case #%d:\n", i);
			for(int j = 0; j < results.size(); j++) {
				System.out.println(results.get(j));
			}
		}
		sc.close();
	}

}

