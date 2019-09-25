### Setup The Python Instance
####  Configuring Google Cloud
Go to [Cloud Console](https://console.cloude.google.com/ "Cloud Console") and navigate to compute engine --> vm instances.
![](https://i.imgur.com/KRwU2aN.png)

Click create a new instance and setup your instances as follows.
![](https://i.imgur.com/i10iusc.png)
**Change the machine type to f1-micro.**
**For machine type use DebianGNU/Linux 9 (stretch).**
**Allow HTTP(S) traffic. **
Click the arrows to expand the settings menu.
I reccomend setting a static IP address although this is not strictly necessary for testing purposes.
Click create and wait for it to allocate resources and start.



Next we need to open up port 5000 to allow inbound traffic for TCP. 
Go to networking --> VPC Network --> Firewall Rules as follows.
![](https://i.imgur.com/DZ1mEjJ.png)



**Apply the following rules, naming the rule as you see fit.**
![](https://i.imgur.com/n1Ttlee.png)

**The instance is now up and running. Let's go to the google cloud console now (or your prefferred method of connecting to the instance).**
![](https://i.imgur.com/n10jc43.png)

Enter the following lines into your console.
`sudo apt install git`

`sudo apt install python-pip`

`pip install flask`

`git clone https://github.com/katyfelkner/cs4263-rng`

`cd cs4263-rng/PythonInstance/`

`python main.py`

**And you should be up and running!** 
Go to compute engine --> vm instances (where we started).
View the external IP address associated with the instance you've been working in.
Append :5000 to the end of it and type it in your browser page. 
For example, here is the link to our python instance which generates a random number.
http://35.238.165.97:5000/
