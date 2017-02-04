
import java.util.Scanner;
import java.util.regex.Pattern;

public class P10082 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
			String ligne = sc.nextLine();
			ligne = ligne.replaceAll("1", "`");
			for(int i = 2; i < 10; i++) {
				ligne = ligne.replaceAll("" + i, "" + (i-1));	
			}
			
			ligne = ligne.replaceAll("0", "9");
			ligne = ligne.replaceAll(Pattern.quote("-"), "0");
			ligne = ligne.replaceAll("=", "-");
			ligne = ligne.replaceAll("W", "Q");
			
			ligne = ligne.replaceAll("E", "W");
			ligne = ligne.replaceAll("R", "E");
			ligne = ligne.replaceAll("T", "R");
			
			ligne = ligne.replaceAll("Y", "T");
			ligne = ligne.replaceAll("U", "Y");
			ligne = ligne.replaceAll("I", "U");
			ligne = ligne.replaceAll("O", "I");
			
			ligne = ligne.replaceAll("P", "O");
			ligne = ligne.replaceAll(Pattern.quote("["), "P");
			ligne = ligne.replaceAll("]", "[");
			ligne = ligne.replaceAll(Pattern.quote("\\"), "]");
			
			ligne = ligne.replaceAll("S", "A");
			ligne = ligne.replaceAll("D", "S");
			ligne = ligne.replaceAll("F", "D");
			ligne = ligne.replaceAll("G", "F");
			
			ligne = ligne.replaceAll("H", "G");
			ligne = ligne.replaceAll("J", "H");
			ligne = ligne.replaceAll("K", "J");
			ligne = ligne.replaceAll("L", "K");
			
			ligne = ligne.replaceAll(";", "L");
			ligne = ligne.replaceAll("'", ";");
			
			
			ligne = ligne.replaceAll("X", "Z");
			ligne = ligne.replaceAll("C", "X");
			ligne = ligne.replaceAll("V", "C");
			ligne = ligne.replaceAll("B", "V");
			
			ligne = ligne.replaceAll("N", "B");
			ligne = ligne.replaceAll("M", "N");
			ligne = ligne.replaceAll(",", "M");
			ligne = ligne.replaceAll(Pattern.quote("."), ",");
			ligne = ligne.replaceAll("/", ".");
			
			System.out.println(ligne);
		}
		sc.close();
	}

}

