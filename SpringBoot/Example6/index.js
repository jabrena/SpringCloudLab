/**
 * REST example in Node.js to compare capabilities
 * between Spring Boot & Node.js + Express
 *
 * curl -d '{"key1":"value1"}'  -H "Content-Type: application/json" http://localhost:3000/v1/route2/
 */
var express = require('express');
var app = express();
var bodyParser = require('body-parser')

// parse application/json
app.use(bodyParser.json())

var returnObject = {
    prop1: "value1",
    prop2: "value2"
};

app.get('/v1/route1', function (req, res) {
    res.json(returnObject);
});

app.post('/v1/route2', function (req, res) {
    console.log(req.body);
    var parameter = null;
    try {
        parameter = req.body.key3;//JSON.parse(req.body);
        console.log(parameter)
        if(parameter === undefined){
            throw new Error('something bad happened');
        }
    } catch (err) {
        res.status(500).send('error', { error: "error" });
    }

    res.json(returnObject);
});

var localPort = 3000;
app.listen(localPort, function () {
    console.log('Example app listening on port ' + localPort);
});