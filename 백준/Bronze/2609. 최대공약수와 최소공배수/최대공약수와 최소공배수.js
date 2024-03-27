const fs = require('fs');
const [N, K] = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

const getGCD = (num1, num2) => {
  return num2 === 0 ? num1 : getGCD(num2, num1 % num2);
};

const getLCM = (num1, num2) => {
  return (num1 * num2) / getGCD(num1, num2);
};

console.log(getGCD(N, K));
console.log(getLCM(N, K));