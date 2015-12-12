use strict;
use warnings;
#use diagnostics;
use 5.20.1;

select(STDOUT); $| = 1; # DO NOT REMOVE

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
# ---
# Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.

my $tokens;

# light_x: the X position of the light of power
# light_y: the Y position of the light of power
# initial_tx: Thor's starting X position
# initial_ty: Thor's starting Y position
chomp($tokens=<STDIN>);
my ($X, $Y, $x, $y) = split(/ /,$tokens);

# game loop
while (1) {
    chomp(my $remaining_turns = <STDIN>); # The remaining amount of turns Thor can move. Do not remove this line.
    
    # Write an action using print
    # To debug: print STDERR "Debug messages...\n";
    
    if($X == $x) {
            if($Y < $y) {
               $y--;
                print "N\n";
            } else {
                $y++;
                print "S\n";
            }
        }
        if($X < $x) {
            if($Y < $y) {
                $x--; $y--;
                print "NW\n";
            }
            if($Y == $y) {
                $x--;
                print "W\n";
            }
            if($y < $Y) {
                $y++; $x--;
                print "SW\n";
            }
        }
        if($x < $X) {
            if($Y < $y) {
                $y--;$x++;
                print "NE\n";
            }
            if($Y == $y) {
                $x++;
                print "E\n";
            }
            if($y < $Y) {
                $x++; $y++;
                print "SE\n";
            }
        }

}
