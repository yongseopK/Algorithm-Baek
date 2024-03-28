const fs = require('fs');
const inputs = fs.readFileSync('/dev/stdin').toString().split(' ');

const A = inputs[0];
const B = inputs[1];

const getGCD = (num1, num2) => {
  if (typeof num1 !== 'bigint' && typeof num2 !== 'bigint') {
    return getGCDBigInt(BigInt(num1), BigInt(num2));
  } else if (typeof num1 !== 'bigint') {
    return getGCDBigInt(BigInt(num1), num2);
  } else if (typeof num2 !== 'bigint') {
    return getGCDBigInt(num1, BigInt(num2));
  } else {
    return getGCDBigInt(num1, num2);
  }
};

const getGCDBigInt = (num1, num2) => {
  if (num2 === 0n) {
    return num1;
  } else {
    return getGCDBigInt(num2, num1 % num2);
  }
};

// Example usage
console.log("1".repeat(Number(getGCD(BigInt(A), BigInt(B))))); // Output: 9n
