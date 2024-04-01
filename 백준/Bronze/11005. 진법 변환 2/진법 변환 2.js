const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split(' ');

const N = Number(inputs[0]);
const B = Number(inputs[1]);


console.log(N.toString(B).toUpperCase());