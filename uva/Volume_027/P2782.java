

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * https://icpcarchive.ecs.baylor.edu problem 2782 in Java - Clay Bully
 * @author Adramaerel
 *
 */
public class P2782 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int integer;
		while((integer = Integer.parseInt(sc.nextLine())) != -1) {
			List<Enfant> list = new ArrayList<>();
			for(int i = 1; i <= integer; i++) {
				String ligne = sc.nextLine();
				String tab [] = ligne.split(" ");
				Enfant enfant = new Enfant();
				enfant.setVolume(Integer.parseInt(tab[0]) * Integer.parseInt(tab[1]) * Integer.parseInt(tab[2]));
				enfant.setNom(tab[3]);
				list.add(enfant );
			}
			
			final int max = list.stream().mapToInt(e -> e.getVolume()).max().getAsInt();
			final int min = list.stream().mapToInt(e -> e.getVolume()).min().getAsInt();
			String enfantMin = list.stream().filter(e -> e.getVolume() == min).findAny().get().getNom();
			String enfantMax = list.stream().filter(e -> e.getVolume() == max).findAny().get().getNom();
			System.out.printf("%s took clay from %s.\n", enfantMax, enfantMin);
			
		}

	}

}
class Enfant {
	
	private int volume;
	private String nom;
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setNom(String string) {
		this.nom = string;
	}
	public String getNom() {
		return nom;
	}
}