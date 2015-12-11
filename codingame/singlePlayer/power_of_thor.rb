STDOUT.sync = true # DO NOT REMOVE
# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
# ---
# Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.

# light_x: the X position of the light of power
# light_y: the Y position of the light of power
# initial_tx: Thor's starting X position
# initial_ty: Thor's starting Y position
@X, @Y, @x, @y = gets.split(" ").collect {|x| x.to_i}

# game loop
loop do
    remaining_turns = gets.to_i # The remaining amount of turns Thor can move. Do not remove this line.
    
    # Write an action using puts
    # To debug: STDERR.puts "Debug messages..."
    
    
    if @X == @x
        if  @Y < @y
            @y-=1
            puts "N"
        else
            @y+=1
            puts "S"
        end
    end
            
        
    if @X < @x
        if @Y < @y 
            @x-=1
            @y-=1
            puts "NW"
        end
        if @Y == @y 
            @x-=1
            puts "W"
        end
        if @y < @Y
            @y+=1
            @x+=1
            puts "SW"
        end
    end

    if @x < @X
        if @Y < @y
            @y-=1
            @x+=1
            puts "NE"
        end
        if @Y == @y
            @x+=1
            puts "E"
        end
        if @y < @Y
            @x+=1 
            @y+=1
            puts "SE"
        end
    end
end
