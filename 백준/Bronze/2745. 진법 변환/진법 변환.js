const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split(' ');

const N = inputs[0];
const B = inputs[1];

console.log(parseInt(N, B));