largest = None
smallest = None
while True:
    num = input("Enter a number: ")
    if num == "done" : break
    try:
        f_num = int(num)
        if largest is None:
            largest = num
            smallest = num
        if float(largest) < f_num:
        	largest = num
        if float(smallest) > f_num:
            smallest = num
    except:
    	print('Invalid input')

     

print('Maximum is ' + largest)
print('Minimum is ' + smallest)

