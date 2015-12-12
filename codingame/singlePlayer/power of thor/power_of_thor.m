#include <Foundation/Foundation.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
int main(int argc, const char * argv[]) {
    int X; // the X position of the light of power
    int Y; // the Y position of the light of power
    int x; // Thor's starting X position
    int y; // Thor's starting Y position
    scanf("%d%d%d%d", &X, &Y, &x, &y);

    // game loop
    while (1) {
        int remainingTurns; // The remaining amount of turns Thor can move. Do not remove this line.
        scanf("%d", &remainingTurns);

        // Write an action using printf(). DON'T FORGET THE TRAILING NEWLINE \n
        // To debug: fprintf(stderr, [@"Debug messages\n" UTF8String]);
        if(X == x) {
            if( Y < y) {
                y--;
                printf([@"N\n" UTF8String]);
            } else {
                y++;
                printf([@"S\n" UTF8String]);
            }
        }
        if(X < x) {
            if(Y < y) {
                x--; y--;
                printf([@"NW\n" UTF8String]);
            }
            if(Y == y) {
                x--;
                printf([@"W\n" UTF8String]);
            }
            if( y < Y) {
                y++; x--;
                printf([@"SW\n" UTF8String]);
            }
        }
        if(x < X) {
            if(Y < y) {
                y--;x++;
                printf([@"NE\n" UTF8String]);
            }
            if(Y == y) {
                x++;
                printf([@"E\n" UTF8String]);
            }
            if( y < Y) {
                x++; y++;
                printf([@"SE\n" UTF8String]);
            }
        }

         // A single line providing the move to be made: N NE E SE S SW W or NW
    }
}
