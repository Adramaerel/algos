import re

handle = open('regex_sum_47305.txt')

somme = 0

for line in handle:

               lst = re.findall('[0-9]+', line)

               for l in lst:

                              somme += int(l)

print(somme)
