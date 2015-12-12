if [X -lt x]
        if [Y -lt y ]
            x = x - 1
            y = y - 1
            echo "NW"
        end
        if [Y -eq y] 
            x = x - 1
            echo "W"
        end
        if [y -lt Y]
            y = y + 1
            x = x + 1
            echo "SW"
        end
end

    if [x -lt X]
        if [Y -lt y]
            y = y - 1
            x = x + 1
            echo "NE"
        end
        if [Y -eq y]
            x = x + 1
            echo "E"
        end
        if [y -lt Y]
            x = x + 1 
            y = x + 1
            echo "SE"
        end
    end
