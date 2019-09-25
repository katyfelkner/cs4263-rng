# Python Web App. Allows for get requests to generate a random number 1-1,000,000.
from flask import Flask
import random
app = Flask(__name__)


@app.route('/')
def hello():
    """Return a friendly HTTP greeting."""
    x = random.randint(1,1000000)
    return str(x)

@app.route('/randomNumber/', methods=["GET"])
def randomNumber():
    x = random.randint(1,1000000)
    return str(x)

if __name__ == '__main__':
    app.run(host='0.0.0.0')
