using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player
{
    static void Main(string[] args)
    {
        string[] inputs = Console.ReadLine().Split(' ');
        int X = int.Parse(inputs[0]); // the X position of the light of power
        int Y = int.Parse(inputs[1]); // the Y position of the light of power
        int x = int.Parse(inputs[2]); // Thor's starting X position
        int y = int.Parse(inputs[3]); // Thor's starting Y position

        // game loop
        while (true)
        {
            int remainingTurns = int.Parse(Console.ReadLine()); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using Console.WriteLine()
            // To debug: Console.Error.WriteLine("Debug messages...");

            if(X == x) {
				if( Y < y) {
					y--;
					Console.WriteLine("N");
				} else {
					y++;
					Console.WriteLine("S");
				}
			}
			if(X < x) {
				if(Y < y) {
					x--; y--;
					Console.WriteLine("NW");
				}
				if(Y == y) {
					x--;
					Console.WriteLine("W");
				}
				if( y < Y) {
					y++; x--;
					Console.WriteLine("SW");
				}
			}
			if(x < X) {
				if(Y < y) {
					y--;x++;
					Console.WriteLine("NE");
				}
				if(Y == y) {
					x++;
					Console.WriteLine("E");
				}
				if( y < Y) {
					x++; y++;
					Console.WriteLine("SE");
				}
			}
        }
    }
}
