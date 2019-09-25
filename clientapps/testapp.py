# python application to test randoms and verify the 750/1000 requirement

import urllib.request
# waste of memory, but fairly fast lookup
numbers = [0] * 1000000
countUnique = 0
countRepeated = 0

appURL = "https://randompythongen.appspot.com/randomNumber/"
# send post request to URL
request = urllib.request.Request(appURL, method="GET")

for i in range(0, 1000):
    with urllib.request.urlopen(request) as r:
        # get response
        response = r.read()
        #print(response)
        number = int(response)

    if numbers[number] == 0:
        numbers[number] = 1
        countUnique += 1
    else:
        countRepeated += 1

    if (i % 25 == 0):
        print ("random numbers fetched:", i)

print("Unique numbers: " + str(countUnique))
print("Repeated numbers: " + str(countRepeated))
