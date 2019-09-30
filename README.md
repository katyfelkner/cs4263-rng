# Random Number Websites

## Setting up URL test

 First Clone the git repo `git clone https://github.com/katyfelkner/cs4263-rng.git` to your desired file.

### Java Compiling

- Note: Java is needs to be installed. Press the `Windows` + `R` key then type : "cmd" and enter. Your Command prompt should open. Once open, you can type javac -version. If a version appears you can proceed to the next step. Otherwise please proceed to this link `https://www.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html` to install and setup your JDK.

1) Open up your CMD and type `cd {path}` to move to the location you cloned this repository to.

2) Type `javac cs4263-rng/Testing/GetRequest.java` and `javac cs4263-rng/Testing/GetRequestTestScript.java` to compile the java scripts.

3) Once compiled, you can run the `GetRequest` and `GetRequestTestScript` to get a single random number or to test the randomness of our algorithm by type `java cs4263-rng/Testing/GetRequest` and `java cs4263-rng/Testing/GetRequestTestScript` respectively. 

### [Python Instance Setup](https://github.com/katyfelkner/cs4263-rng/blob/master/PythonInstance/Setup.md "Python Instance Setup")
The link to our current implementation: [Instance RNG Python](http://35.238.165.97:5000/ "Instance RNG Python")
 
### [Python App Engine Setup](https://github.com/katyfelkner/cs4263-rng/blob/master/PythonAppEngine/PyAppEngineSetup.md "Python App Engine Setup")
The link to our current implementation: [App Engine RNG Python](http://randompythongen.appspot.com/randomNumber/ "Instance RNG Python")

### [Java App Engine Setup](https://github.com/katyfelkner/cs4263-rng/blob/master/JavaAppEngine/Readme.md "Java App Engine Setup")
The link to our current implementation: [App Engine RNG Java](http://java-random-number.appspot.com/demo "Instance RNG Python")

### [Testing](https://github.com/katyfelkner/cs4263-rng/blob/master/Testing/TestingDocumentation.md "Java App Engine Setup")

### Timing
Generated using the GetRequest.java
Central Region: App Java, App Python, Instance Java, Instance Python
10.204.6.71: US-Central-1_App_Java @http://java-random-number.appspot.com/demo 325 223831
10.204.6.71: US-Central-1_App_Python @http://randompythongen.appspot.com/randomNumber/ 149 83806
10.204.6.71: US-Central-1_Instance_Java @http://104.199.77.112:5000/ 255 978982
10.204.6.71: US-Central-1_Instance_Python @http://35.238.165.97:5000/ 112 119348
EU-WEST-1 Region: App Java, App Python, Instance Java, Instance Python
10.204.6.71: EU-WEST-1_App_Java @https://composed-anvil-254017.appspot.com/demo 575 855859
10.204.6.71: EU-WEST-1_App_Python @https://cs4263-test.appspot.com 291 974314
10.204.6.71: EU-WEST-1_Instance_Java @http://34.77.239.200:5000/ 251 154908
10.204.6.71: EU-WEST-1_Instance_Python @http://35.238.165.97:5000/ 107 929849

## Overview

This repo concists of two clients one written in Python the other in Java that perform REST GET requests. They both hit two API endpoint that are also written in there respective langauge. The endpoint are being hosted on via two google cloud instances `https://randompythongen.appspot.com/randomNumber/` for Python and `http://java-random-number.appspot.com/demo` for Java. These two REST API endpoint return a random number between 1 and 1,000,000.

Both test application perform 1000 GET request to ensure that at least 750 of them are unique. It does this test ten times and then averages the result printing it out to the console. It also prints out what loop its on every 25 GET request to provide feedback to the user.
