fname = input("Enter file name: ")
if len(fname) < 1 : fname = "mbox-short.txt"

count = 0
fh = open(fname)
for line in fh:
    if line.startswith('From') and not line.startswith('From:'):
        words = line.split(' ')
        print(words[1])
        count += 1
print('There were ' + str(count)+' lines in the file with From as the first word')
