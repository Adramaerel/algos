import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://uva.onlinejudge.org problem 499 in Java - What's The Frequency, Kenneth ?
 * @author Adramaerel
 *
 */
public class P499 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Objet> list = new ArrayList<>();
		while(sc.hasNext()) {
			for(char i = 'A'; i <= 'z' ; i++) {
				list.add(new Objet(i, 0));
			}
			String ligne = sc.nextLine();
			for(int i = 0; i < ligne.length(); i++) {
				char c = ligne.charAt(i);
				if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
					list.get(c - 'A').setI(list.get(c - 'A').getI() + 1);
				}
			}

			int maximum = list.stream().mapToInt(o -> o.getI()).max().getAsInt();

			for(char i = 'A'; i <= 'z' ; i++)
				if(i > 'Z' && i < 'a') 
					continue;
				else {
					if(list.get(i - 'A').getI().equals(maximum)) {
						System.out.print(i);
					}
				}
			System.out.println(" " + maximum);
			list.clear();
		}
	}
}
class Objet {
	private Character c;
	private Integer i;
	public Objet(char c, int j) {
		this.c = c;
		this.i = j;
	}
	public Character getC() {
		return c;
	}
	public void setC(Character c) {
		this.c = c;
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
}
