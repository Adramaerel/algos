# Use the file name mbox-short.txt as the file name
fname = input("Enter file name: ")
fh = open(fname)
somme = 0.0
count = 0
for line in fh:
    if not line.startswith("X-DSPAM-Confidence:") : 
        continue
    x = line.find(':')
    s_number = line[x + 1 : len(line)]
    somme += float(s_number)
    count += 1
print("Average spam confidence: " + str(somme / count))

