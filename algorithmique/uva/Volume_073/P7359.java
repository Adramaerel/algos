import java.util.Scanner;

public class P7359 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer casesNb = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= casesNb; i++) {
			String []input = sc.nextLine().split(" " );
			System.out.printf("%d %d %d %d\n", i, sum_1(Integer.parseInt(input[1])),
					sum_2(Integer.parseInt(input[1])), sum_3(Integer.parseInt(input[1])));
			
		}
		
		sc.close();
		
	}

	private static int sum_3(int parseInt) {
		return parseInt * (parseInt + 1);
	}

	private static int sum_2(int parseInt) {
		return parseInt * parseInt;
	}

	private static int sum_1(int parseInt) {
		return parseInt * (parseInt + 1) /2;
	}

}

