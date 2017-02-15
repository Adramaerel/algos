import java.util.Scanner;

public class P575 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		while(!(input = sc.nextLine()).equals("0")) {
			int j = 0;
			int reponse = 0;
			for(int i = input.length() -1 ; i > -1; i--) {
				int nombre = Integer.parseInt(input.charAt(i) + "");
				reponse += nombre * (Math.pow(2, j+1) -1);
				j++;
			}
			System.out.println(reponse);
			
		}
		
	}

}
