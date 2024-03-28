const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split('\n');
const T = Number(inputs[0]);

const getGCD = (num1, num2) => {
  return num2 === 0 ? num1 : getGCD(num2, num1 % num2);
};

const getLCM = (num1, num2) => {
  return (num1 * num2) / getGCD(num1, num2);
};

for (let i = 1; i <= T; i++) {
  const x = Number(inputs[i].split(' ')[0]);
  const y = Number(inputs[i].split(' ')[1]);

  console.log(getLCM(x, y));
}