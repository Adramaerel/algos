/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/

var inputs = readline().split(' ');
var X = parseInt(inputs[0]); // the X position of the light of power
var Y = parseInt(inputs[1]); // the Y position of the light of power
var x = parseInt(inputs[2]); // Thor's starting X position
var y = parseInt(inputs[3]); // Thor's starting Y position

// game loop
while (true) {
    var remainingTurns = parseInt(readline()); // The remaining amount of turns Thor can move. Do not remove this line.

    // Write an action using print()
    // To debug: printErr('Debug messages...');

    if(X == x) {
            if( Y < y) {
                y--;
                print("N");
            } else {
                y++;
                print("S");
            }
        }
        if(X < x) {
            if(Y < y) {
                x--; y--;
                print("NW");
            }
            if(Y == y) {
                x--;
                print("W");
            }
            if( y < Y) {
                y++; x--;
                print("SW");
            }
        }
        if(x < X) {
            if(Y < y) {
                y--;x++;
                print("NE");
            }
            if(Y == y) {
                x++;
                print("E");
            }
            if( y < Y) {
                x++; y++;
                print("SE");
            }
        }
}
