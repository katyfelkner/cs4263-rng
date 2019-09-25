# python application to test randoms and verify the 750/1000 requirement

import urllib.request
import time

appURL = ["http://randompythongen.appspot.com/randomNumber/",
        "http://35.238.165.97:5000/",
        "http://java-random-number.appspot.com/demo"]

for x in appURL:
    request = urllib.request.Request(x, method="GET")
    t_0 = time.clock()
    for i in range(0, 1000):
        with urllib.request.urlopen(request) as r:
            response = r.read()
            number = int(response)#.decode("utf-8"))
    print("Time for " + x + " is " + str(time.clock() - t_0))

