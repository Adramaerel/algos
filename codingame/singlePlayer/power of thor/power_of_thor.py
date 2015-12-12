import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
# ---
# Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.

 # light_x: the X position of the light of power
 # light_y: the Y position of the light of power
 # initial_tx: Thor's starting X position
 # initial_ty: Thor's starting Y position
X, Y, x, y = [int(i) for i in raw_input().split()]

# game loop
while 1:
    remaining_turns = int(raw_input()) # The remaining amount of turns Thor can move. Do not remove this line.

    # Write an action using print
    # To debug: print >> sys.stderr, "Debug messages..."

    # A single line providing the move to be made: N NE E SE S SW W or NW
    
    
    
    if X == x :
        if  Y < y:
            y-=1
            print "N"
        else:
            y+=1
            print "S"
            
        
    if X < x:
        if Y < y :
            x-=1
            y-=1
            print "NW"
        if Y == y :
            x-=1
            print "W"
        if y < Y:
            y+=1
            x+=1
            print "SW"

    if x < X:
        if Y < y:
            y-=1
            x+=1
            print "NE"
        if Y == y:
            x+=1
            print "E"
        if y < Y:
            x+=1 
            y+=1
            print "SE"


