

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
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
			
			if(Y < y) {
			    System.out.print("N"); y--;
			} 
			if(y < Y) {
			    System.out.print("S"); y++;
			}
			
			if(X < x) {
			    System.out.print("W"); x--;
			}
			
			if(X > x) {
			    System.out.print("E"); x++;
			}
			System.out.println();
			
		
		}
	}
}

