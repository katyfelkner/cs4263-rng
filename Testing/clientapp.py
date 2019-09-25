# python application to get one number and copy to clipboard

import urllib.request

appURL = "https://randompythongen.appspot.com/randomNumber/"
# send post request to URL
request = urllib.request.Request(appURL, method="GET")

with urllib.request.urlopen(request) as r:
    # get response
    # parse as int and print to stdout
    print(int(r.read()))
