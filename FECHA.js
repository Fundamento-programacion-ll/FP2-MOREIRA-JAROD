const moment = require('moment')
moment.locale('es');
var fecha = new Date();
console.log(fecha);
console.log(fecha.getDay());
console.log(fecha.getMonth());
console.log(fecha.getFullYear());
console.log(dia: $(fecha.getDate()), dia: $(fecha.getMonth));
const horaActual =moment().format('hh:mm:ss');
console.log(horaActual);
console.log(moment().add(3,'hours').toString());

console.log(fecha.toISOString());
console.log(fecha.toDateString());
console.log(fecha.toUTCString());

console.log(fecha.getDay(), fecha.getMonth(), fecha.getFullYear());
//console.log(dia: $(fecha.getDate(fecha.getMonth(), fecha.getFullYear()));


console.log(moment().format('dddd').toString);