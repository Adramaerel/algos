name = input("Enter file:")
if len(name) < 1 : 
    name = "mbox-short.txt"
dic = dict()
handle = open(name)
for lines in handle:
    if lines.startswith('From '):
        words = lines.split(' ')
        word = words[1]
        if word in dic:
            value = dic.get(word)
            dic[word] = value +1
        else:
        	dic[word] = 1
max = 0
keyMax = ''
for key in dic.keys():
    if dic.get(key) > max:
        max = dic.get(key)
        keyMax = key
print(keyMax + ' '+ str(max))
    


