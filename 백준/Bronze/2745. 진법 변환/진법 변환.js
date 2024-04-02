const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split(' ');

const N = inputs[0];
const B = parseInt(inputs[1]);

const getDecimalValue = (char) => {
  if (char >= '0' && char <= '9') return char.charCodeAt(0) - 48;
  return char.charCodeAt(0) - 55;
};

let decimalValue = 0;
const len = N.length;

for (let i = 0; i < len; i++) {
  decimalValue += getDecimalValue(N[i]) * Math.pow(B, len - i - 1);
}

console.log(decimalValue);
