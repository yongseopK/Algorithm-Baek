const fs = require('fs');
const n = fs.readFileSync('/dev/stdin').toString().trim();


const binaryToOctal = (binaryNumber) => {
  // 이진수의 길이가 3의 배수가 되도록 앞에 0을 추가
  while (binaryNumber.length % 3 !== 0) {
    binaryNumber = '0' + binaryNumber;
  }

  let octalNumber = '';

  // 이진수를 3자리씩 잘라서 8진수로 변환
  for (let i = 0; i < binaryNumber.length; i += 3) {
    const octalDigit = parseInt(binaryNumber.slice(i, i + 3), 2).toString(8);
    octalNumber += octalDigit;
  }

  // 8진수 앞의 불필요한 0 제거
  octalNumber = octalNumber.replace(/^0+/, '');

  // 8진수가 비어있는 경우 '0'으로 설정
  if (octalNumber === '') {
    octalNumber = '0';
  }

  return octalNumber;
};

// 이진수를 8진수로 변환하여 출력
console.log(binaryToOctal(n));