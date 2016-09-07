import java.util.Scanner;


 public class MaxPairWiseProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String input [] = sc.nextLine().split(" ");
		long max1 = Long.parseLong(input[0]), max2 = Long.parseLong(input[1]);
		for(int i = 2 ; i <input.length; i++) {
			long value = Long.parseLong(input[i]);
			long tmp = max1;
			if(value > max1) {
				max1 = value;
				if(tmp > max2) {
					max2 = tmp;
				}
				continue;
			} else if(value > max2) {
				max2 = value;
				continue;
			}
		}
		
		System.out.println(max1 * max2);

	}

}

