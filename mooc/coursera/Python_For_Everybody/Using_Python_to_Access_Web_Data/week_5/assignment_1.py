import urllib.request, urllib.parse, urllib.error
import xml.etree.ElementTree as ET

serviceurl = 'http://maps.googleapis.com/maps/api/geocode/xml?'

while True:
	address = input('Enter location: ')
#	address = 'http://py4e-data.dr-chuck.net/comments_42.xml'
	if len(address) < 1: break

	url = serviceurl + urllib.parse.urlencode({'address': address})
	print('Retrieving', address)
	uh = urllib.request.urlopen(address)
	data = uh.read()
	print('Retrieved', len(data), 'characters')
	tree = ET.fromstring(data)
	comments = tree.find('comments')
	somme = 0
	count = 0

	for comment in comments:
		count_node = comment.find('count')
		somme += int(count_node.text)
		count += 1
	print('Count:', str(count))
	print('Sum:', str(somme))
	break

