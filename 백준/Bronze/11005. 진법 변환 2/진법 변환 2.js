const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split(' ');

let N = Number(inputs[0]);
const B = Number(inputs[1]);
let answer = '';

const notation = (x) => {
  if (x < 10) return x;
  return String.fromCharCode(x + 55);
};

if (N == 0) {
  console.log(0);
} else {
  while (N > 0) {
    let s = notation(N % B);
    answer = s + answer;
    N = Math.floor(N / B);
  }
  console.log(answer);
}

