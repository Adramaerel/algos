
import java.util.Scanner;

public class P591 {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		int compteur = 1;
		while(!sc.nextLine().equals("0")) {
			String [] numbers = sc.nextLine().split(" ");
			int moyenne = 0;
			int nb = 0;
			for(int i = 0; i < numbers.length; i++) {
				moyenne += Integer.parseInt(numbers[i]);

			}
			moyenne = moyenne / numbers.length;
			for(int i=0; i < numbers.length; i++)
				if(Integer.parseInt(numbers[i]) > moyenne)
					nb = nb + (Integer.parseInt(numbers[i])-moyenne);
			System.out.printf("Set #%d\n", compteur++);
			System.out.printf("The minimum number of moves is %d.\n\n", nb);

		}
	}

}

