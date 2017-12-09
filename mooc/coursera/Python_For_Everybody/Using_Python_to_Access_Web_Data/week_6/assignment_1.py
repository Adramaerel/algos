import json
import urllib.request, urllib.parse, urllib.error

address = input('Enter location: ')
print('Retrieving', address)
uh = urllib.request.urlopen(address)
data = uh.read()
print('Retrieved', len(data), 'characters')

info = json.loads(data)

count = 0
somme = 0;

for item in info['comments']:
	somme += int(item['count'])
	count += 1
print('Count:', count)
print('Sum:', somme)

