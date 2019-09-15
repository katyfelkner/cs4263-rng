# Random Number Websites

## Setting up URL test

 First Clone the git repo `git clone https://github.com/katyfelkner/cs4263-rng.git` to your desired file.

### Java Compiling

- Note: Java is needs to be installed. Press the `Windows` + `R` key then type : "cmd" and enter. Your Command prompt should open. Once open, you can type javac -version. If a version appears you can proceed to the next step. Otherwise please proceed to this link `https://www.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html` to install and setup your JDK.

1) Open up your CMD and type `cd {path}` to move to the location you cloned this repository to.

2) Type `javac cs4263-rng/clientapps/JavaClientApps/GetRequest.java` and `javac cs4263-rng/clientapps/JavaClientApps/GetRequestTestScript.java` to compile the java scripts.

3) Once compiled, you can run the `GetRequest` and `GetRequestTestScript` to get a single random number or to test the randomness of our algorithm by type `java cs4263-rng/clientapps/JavaClientApps/GetRequest` and `java cs4263-rng/clientapps/JavaClientApps/GetRequestTestScript` respectively. 

### Python Running

- Note: Please ensure you have python installed. If not follow these instruction `https://realpython.com/installing-python/`

 1) you can run the `clientapp.py` and `testapp.py` to get a single random number or to test the randomness of our algorithm by type `python 3 cs4263-rng/clientapps/clientapp.py` and `python 3 cs4263-rng/clientapps/testapp.py` respectively.
 
 ## Overview

This repo concists of two clients one written in Python the other in Java that perform REST GET requests. They both hit two API endpoint that are also written in there respective langauge. The endpoint are being hosted on via two google cloud instances `https://randompythongen.appspot.com/randomNumber/` for Python and `http://java-random-number.appspot.com/demo` for Java. These two REST API endpoint return a random number between 1 and 1,000,000.

Both test application perform 1000 GET request to ensure that at least 750 of them are unique. It does this test ten times and then averages the result printing it out to the console. It also prints out what loop its on every 25 GET request to provide feedback to the user.
