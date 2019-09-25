import urllib.request
from time import perf_counter

appURL = ['http://randompythongen.appspot.com/randomNumber/',
        'http://35.238.165.97:5000/',
        'http://java-random-number.appspot.com/demo']

for x in appURL:
    request = urllib.request.Request(x, method="GET")
    t_0 = perf_counter()
    for i in range(0, 100):
        with urllib.request.urlopen(request) as r:
            response = r.read()
            number = int(response)#.decode("utf-8"))
    t_f = perf_counter()
    print('Time for ' + x + ' is ' + '{0:.3f}'.format(t_f - t_0) + ' seconds')
