# Instruction how to create an AppEngines Java API end point

First you will need a google cloud instance. Then can navigate to `https://console.cloud.google.com/getting-started?tutorial=java_gae_quickstart` 
for a quick guild to creating and deploying your first appengine application. 

## Tutorial basics

- From Loggin screen Click `Go to Console` Then click `Navigation menu` Which is a hamburger icon on the right.
- In Navigation Menu click AppEngine.
- Create a new project. 
- Once Application is active and created you can click the `Activate Cloud Shell` in order to tunnel into your Engines instance.
- Once tunneled into your Engine. Type `git clone https://github.com/GoogleCloudPlatform/appengine-try-java`
- Navigate to Java folder,  `cd appengine-try-java/src/main/java/myapp` and open `DemoServlet.java` with your favorite editor. 
    - EX: `emacs DemoServlet.java`
- Replace the `Hello world` response with desiered response. It can either be in JSON format or plane string text.
- Save your changes. (in emacs its Ctrl+s then Ctrl+c)
- Navigate to root folder.
    - `cd ~/appengine-try-java`
- Run Maven `mvn appengine:run` to handle all dependecies and run the server that will compile and run java on a server. 
- You can then click the `Web Preview` button to view port 8080 and see your return result.
    - If you chose not to keep object in JSON format add `/demo` to the URL right after port.
- Once finished view your endpoints you can terminate the `Preview Instance` by hitting `Ctrl+c` inside `Cloud Shell`
- When you are ready to deploy you application you will need to create gcloud application. 
    - type `gcloud app create` in Shell
    - Then configure your appengine domain by typing `gcloud config set project <YOUR-PROJECT>`
        - You will then be prompted to select a server location. 
        -  Choose the closest region to you or your desired audience
    - Lastly you can deploy by typing `mvn appengine:deploy`
    - You can now access your instance at `http://<Your-Project-Name>.appspot.com/demo`
