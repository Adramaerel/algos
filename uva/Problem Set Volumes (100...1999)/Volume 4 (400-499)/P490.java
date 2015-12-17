import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P490 {
	
	static List<String> sentences = new ArrayList<String>();
	static int max = 0;
	public static void main(String[] args){
		
		lireInput();
		
		calculateMaxLength();
		
		afficherResultat();
		
	}
	private static void afficherResultat() {
		
		for(int j = 0; j < 100; j++)  {
			for(int i = 0; i < sentences.size(); i++) {
				try {
					System.out.print(sentences.get(sentences.size() - i - 1).charAt(j));
				} catch(StringIndexOutOfBoundsException e) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	private static void calculateMaxLength() {
		for(String s : sentences) {
			if(s.length() > max) {
				max = s.length();
			}
		}
		
	}
	private static void lireInput()  {
		try {
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		String ligne = "";
		while((ligne = entree.readLine()).length() > 0) {
			sentences.add(ligne);
		}
		} catch(Exception e) {
			
		}
	}

}

