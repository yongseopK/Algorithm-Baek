const fs = require('fs');
const octalNumber = fs.readFileSync('/dev/stdin').toString().trim();


const octalToBinary = (octalNumber) => {
  let binaryNumber = '';

  // 8진수의 각 자리를 순회하면서 이진수로 변환
  for (let i = 0; i < octalNumber.length; i++) {
    const octalDigit = parseInt(octalNumber[i], 8);
    const binaryDigit = octalDigit.toString(2).padStart(3, '0');
    binaryNumber += binaryDigit;
  }

  // 이진수 앞의 불필요한 0 제거
  binaryNumber = binaryNumber.replace(/^0+/, '');

  // 이진수가 비어있는 경우 '0'으로 설정
  if (binaryNumber === '') {
    binaryNumber = '0';
  }

  return binaryNumber;
};

// 8진수를 이진수로 변환하여 출력
console.log(octalToBinary(octalNumber));