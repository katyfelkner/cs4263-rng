### Setup The Java Instance
####  Configuring Google Cloud
Go to [Cloud Console](https://console.cloude.google.com/ "Cloud Console") and navigate to compute engine --> vm instances.
![](https://i.imgur.com/KRwU2aN.png)

Click create a new instance and setup your instances as follows.
![](https://i.imgur.com/i10iusc.png)
**Change the machine type to f1-micro.**
**For machine type use DebianGNU/Linux 9 (stretch).**
**Allow HTTP(S) traffic.**
Click the arrows to expand the settings menu.
I recommend setting a static IP address although this is not strictly necessary for testing purposes.
Click create and wait for it to allocate resources and start.



Next we need to open up port 5000 to allow inbound traffic for TCP. 
Go to networking --> VPC Network --> Firewall Rules as follows.
![](https://i.imgur.com/DZ1mEjJ.png)



**Apply the following rules, naming the rule as you see fit.**
![](https://i.imgur.com/n1Ttlee.png)

**The instance is now up and running. Let's go to the google cloud console now (or your prefferred method of connecting to the instance).**
![](https://i.imgur.com/n10jc43.png)

#### Install the Requirements

Enter the following lines into your console.

`sudo apt install git`

`wget -c http://repo1.maven.org/maven2/org/eclipse/jetty/jetty-distribution/9.3.12.v20160915/jetty-distribution-9.3.12.v20160915.tar.gz`

`tar xzf jetty-distribution-9.3.12.v20160915.tar.gz`

`mv jetty-distribution-9.3.12.v20160915 jetty9`

`sudo mv jetty9 /opt`

`sudo apt install maven`

`git clone https://github.com/katyfelkner/cs4263-rng`

`cd cs4263-rng/JavaInstance/`

`mvn jetty:run`

**And you should be up and running!**
