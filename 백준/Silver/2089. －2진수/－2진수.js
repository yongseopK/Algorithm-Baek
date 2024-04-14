const fs = require("fs");
let input = Number(fs.readFileSync("/dev/stdin").toString().trim());

if (input === 0) {
  console.log(0);
} else {
  let remainderArr = [];

  while (input / -2 !== 0) {
    let remainder = input % -2;

    if (remainder === 1 || remainder === -1) {
      input = Math.floor(input / -2) + 1;

      remainderArr.push(1);
    } else if (remainder === 0) {
      input = Math.floor(input / -2);

      remainderArr.push(0);
    }
  }

  console.log(remainderArr.reverse().join(""));
}