let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split("\n");

let Lstack = input[0].split('');
let Rstack = [];
for (let i = 2; i < input.length; i++) {
  let array = input[i].split(" ");
  if (array[0] === 'B') {
    Lstack.pop();
  } else if (array[0] === "P") {
    Lstack.push(array[1]);
  } else if (array[0] === "L" && Lstack.length) {
    Rstack.push(Lstack.pop());
  } else if (array[0] === "D" && Rstack.length) {
    Lstack.push(Rstack.pop());
  }
}
let answer = Lstack.join('');
answer += Rstack.reverse().join('');
console.log(answer);