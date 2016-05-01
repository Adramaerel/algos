
import java.util.Scanner;

public class P12250 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ligne;
		int i = 1;
		while(!(ligne = sc.nextLine()).equals("#")) {
			System.out.print("Case " + i + ": ");
			i++;
			switch (ligne) {

			case "HELLO":
				System.out.println("ENGLISH");
				break;
			case "HOLA":
				System.out.println("SPANISH");
				break;
			case "HALLO":
				System.out.println("GERMAN");
				break;
			case "BONJOUR":
				System.out.println("FRENCH");
				break;
			case "CIAO":
				System.out.println("ITALIAN");
				break;
			case "ZDRAVSTVUJTE":
				System.out.println("RUSSIAN");
				break;
				default:
					System.out.println("UNKNOWN");
					break;
				
			}
		}

	}

}

