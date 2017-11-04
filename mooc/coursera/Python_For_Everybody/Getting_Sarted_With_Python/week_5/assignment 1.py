hrs = input("Enter Hours:")
rate = input("Enter Rate per hours:")

hrs_float = float(hrs)
rate_float = float(rate)

heure_sup = hrs_float - 40

pay = 0.0

if hrs_float <= 40:
	pay = hrs_float * rate_float
else:
	pay = 40 * rate_float + heure_sup * rate_float * 1.5

print(pay)
