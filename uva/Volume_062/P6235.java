import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * icpcarchive.ecs.baylor.edu problem 6235 in Java - Tongues
 * @author Sophie
 *
 */
public class P6235 {
	static List<String> voyelles = new ArrayList<String>() {/**
		 * 
		 */
		private static final long serialVersionUID = -6751583304885202784L;

	{
		add("a");
		add("i");
		add("y");
		add("e");
		add("o");
		add("u");
	}};

	static List<String> consonnes = new ArrayList<String>() {/**
		 * 
		 */
		private static final long serialVersionUID = -3170840323676583855L;

	{
	
		add("b");
		add("k");
		add("x");
		add("z");
		add("n");
		add("h");
		add("d");
		add("c");
		add("w");
		add("g");
		add("p");
		add("v");
		add("j");
		add("q");
		add("t");
		add("s");
		add("r");
		add("l");
		add("m");
		add("f");
	}};

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String ligne = sc.nextLine();
			ligne.chars().forEach(
					c -> {
						boolean isUp = c >= 'A' && c <= 'Z';
						String s = (char)c + "";
						s = s.toLowerCase();
							c = s.charAt(0);
					System.out.print(voyelles.contains("" + (char)c) 
					? (isUp ? voyelleSuivante((char)c).toUpperCase() : voyelleSuivante((char)c).toLowerCase()) 
					: (consonnes.contains("" + (char)c) 
						? (isUp ? consonneSuivante((char)c).toUpperCase() : consonneSuivante((char)c).toLowerCase())
						: (char)c));
					return;}
					);
			System.out.println();
		}
		
		sc.close();

	}

	private static String consonneSuivante(char c) {
		int index = consonnes.indexOf("" + (char)c);
		return consonnes.get(((index + 10) % consonnes.size()));
	}

	private static String voyelleSuivante(char c) {
		int index = voyelles.indexOf("" + (char)c);
		return voyelles.get(((index + 3) % voyelles.size()));
	}

}
