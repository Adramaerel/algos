def computepay(h,r):
    if h > 40:
        return 40 * r + (h - 40) * r * 1.5
    else:
    	return h * r

hrs = input("Enter Hours:")
f_hrs = float(hrs)
rate = input("Enter Rate:")
f_rate = float(rate)

p = computepay(f_hrs, f_rate)
print(p)
