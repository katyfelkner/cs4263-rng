# python application to get one number and copy to clipboard

import urllib

appURL = "https://randompythongen.appspot.com/"
# send post request to URL
request = urllib.request.Request(appURL)

with urllib.request.urlopen(request) as r:
    # get response
    print(f.read())
    # parse response

    # copy to clipboard
