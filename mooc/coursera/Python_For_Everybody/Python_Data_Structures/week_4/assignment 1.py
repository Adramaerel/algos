fname = input("Enter file name: ")
fh = open(fname)
lst = []
for line in fh:
    words = line.split(' ')
    for word in words:
        if(not word in lst):
    		lst.append(word.strip())
lst.sort()
print(lst)
