<?php
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/

fscanf(STDIN, "%d %d %d %d",
    $X, // the X position of the light of power
    $Y, // the Y position of the light of power
    $x, // Thor's starting X position
    $y // Thor's starting Y position
);

// game loop
while (TRUE)
{
    fscanf(STDIN, "%d",
        $remainingTurns // The remaining amount of turns Thor can move. Do not remove this line.
    );

    // Write an action using echo(). DON'T FORGET THE TRAILING \n
    // To debug (equivalent to var_dump): error_log(var_export($var, true));

	if($X == $x) {
		if($Y < $y) {
			$y--;
			echo("N\n");
		} else {
			$y++;
			echo("S\n");
		}
	}
	if($X < $x) {
		if($Y < $y) {
			$x--; $y--;
			echo("NW\n");
		}
		if($Y == $y) {
			$x--;
			echo("W\n");
		}
		if( $y < $Y) {
			$y++; $x--;
			echo("SW\n");
		}
	}
	if($x < $X) {
		if($Y < $y) {
			$y--;$x++;
			echo("NE\n");
		}
		if($Y == $y) {
			$x++;
			echo("E\n");
		}
		if( $y < $Y) {
			$x++; $y++;
			echo("SE\n");
		}
	}
}
?>
