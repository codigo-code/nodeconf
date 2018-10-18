var express = require('express');
var router = express.Router();

var persona={
  nombre: 'dante',
  apellido: 'panella'
};

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

router.get('/getPersona', function(req, res, next) {
  res.json(persona);
});


module.exports = router;
