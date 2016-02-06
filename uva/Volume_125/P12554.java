import java.util.Scanner;

public class P12554 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nb = Integer.parseInt(sc.nextLine());
		String song = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
		String [] songTab = song.split(" ");
		String names [] = new String[nb];
		for(int i = 0; i < nb; i++) {
			names[i] = sc.nextLine();
		}

		int compteur = 1;
		int compteurSong = 0;
		int compteurNames = 0;
		boolean mayBreak = false;
		for(;;) {
			System.out.println(names[compteurNames] + ": " + songTab[compteurSong]);
			compteurNames++;
			compteurSong++;
			compteurNames %= names.length;
			compteurSong %= songTab.length;
			compteur++;
			if(compteur >= names.length) {
				mayBreak = true;
			}
			if(mayBreak && (compteurSong % songTab.length) == 0) break;

		}

	}

}

