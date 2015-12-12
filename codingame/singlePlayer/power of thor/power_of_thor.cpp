#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
int main()
{
    int X; // the X position of the light of power
    int Y; // the Y position of the light of power
    int x; // Thor's starting X position
    int y; // Thor's starting Y position
    cin >> X >> Y >> x >> y; cin.ignore();

    // game loop
    while (1) {
        int remainingTurns; // The remaining amount of turns Thor can move. Do not remove this line.
        cin >> remainingTurns; cin.ignore();

        // Write an action using cout. DON'T FORGET THE "<< endl"
        // To debug: cerr << "Debug messages..." << endl;

         if(X == x) {
            if( Y < y) {
                y--;
                printf("N\n");
            } else {
                y++;
                printf("S\n");
            }
        }
        if(X < x) {
            if(Y < y) {
                x--; y--;
                printf("NW\n");
            }
            if(Y == y) {
                x--;
                printf("W\n");
            }
            if( y < Y) {
                y++; x--;
                printf("SW\n");
            }
        }
        if(x < X) {
            if(Y < y) {
                y--;x++;
                printf("NE\n");
            }
            if(Y == y) {
                x++;
                printf("E\n");
            }
            if( y < Y) {
                x++; y++;
                printf("SE\n");
            }
        }
    }
}
