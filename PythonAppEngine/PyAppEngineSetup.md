### Setup The Python App on App Engine
Go to [Google Cloud](https://console.cloude.google.com/ "Cloud Console"). Open the project selection dialog by clicking on the project name in the top left of the console. Create a new project and navigate to App Engine -> Dashboard.

Click "Create Application". Select a region (us-central is fine) and then click "Create App."

On the next screen, select Python for the language and a Standard runtime. Click next.

Now, open up a Cloud Shell using the button in the top right of the dashboard. When it opens, verify that your project is the current project. If it is not, run: `gcloud init` and select the correct project when prompted.

Make a directory for your app by running `mkdir myapp` in the Cloud Shell. Then, move into the directory with `cd myapp`.

Now, clone the git repo for this application using:
`git clone https://github.com/katyfelkner/cs4263-rng.git`

Move into the directory for the Python App Engine app using:
`cd cs4263-rng/PythonAppEngine`

Install flask (dependency for our application) using:
`sudo pip3 install -r requirements.txt`

When the installation is finished, deploy the App Engine app using:
`gcloud app deploy`

Press 'Y' to confirm when prompted.

Once your app is deployed, you can view it at <projectname>.appspot.com.
