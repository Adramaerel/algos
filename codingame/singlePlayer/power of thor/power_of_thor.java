import java.util.*;
import java.io.*;
import java.math.*;

class Player {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt(); // the X position of the light of power
		int Y = in.nextInt(); // the Y position of the light of power
		int x = in.nextInt(); // Thor's starting X position
		int y = in.nextInt(); // Thor's starting Y position

		// game loop
		while (true) {
			int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

			if(X == x) {
				if( Y < y) {
					y--;
					System.out.println("N");
				} else {
					y++;
					System.out.println("S");
				}
			}
			if(X < x) {
				if(Y < y) {
					x--; y--;
					System.out.println("NW");
				}
				if(Y == y) {
					x--;
					System.out.println("W");
				}
				if( y < Y) {
					y++; x--;
					System.out.println("SW");
				}
			}
			if(x < X) {
				if(Y < y) {
					y--;x++;
					System.out.println("NE");
				}
				if(Y == y) {
					x++;
					System.out.println("E");
				}
				if( y < Y) {
					x++; y++;
					System.out.println("SE");
				}
			}
		}
	}
}

