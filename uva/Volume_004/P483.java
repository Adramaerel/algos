import java.util.Scanner;

public class P483 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ligne;
		while(sc.hasNext()) {
			ligne = sc.nextLine();
			String [] words = ligne.split(" ");
			for(int i = 0; i < words.length; i++)  {
				String word = words[i];	
				for(int j = 0; j < word.length(); j++) {
					System.out.print(word.charAt(word.length() - j - 1));
				}
				if(i < words.length - 1)
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}

