name = input("Enter file:")
if len(name) < 1 : name = "mbox-short.txt"
dic = dict()
handle = open(name)
for line in handle:
    if line.startswith('From '):
        words = line.split(' ')
        word = words[6]
        time = word[0:2]
        if time in dic:
            value = dic.get(time)
            dic[time] = value +1
        else:
        	dic[time] = 1
t = dic.items()
t.sort()
for x in t:
    print(x[0] + ' '+ str(x[1]))

        

