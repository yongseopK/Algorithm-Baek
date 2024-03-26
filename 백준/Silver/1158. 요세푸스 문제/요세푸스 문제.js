const { log } = require('console');
let fs = require('fs');
let inputArray = fs.readFileSync('/dev/stdin').toString().trim().split(" ");

const N = parseInt(inputArray[0]);
const K = parseInt(inputArray[1]);
const resultArray = [];
let index = 0;
let peopleArray = Array.from(Array(N).keys()).map((x) => x + 1);  // 1 ~ N만큼 배열을 선언

for (let i = 0; i < N; i++) { // N만큼 반복
  let innerK = 1;
  while (innerK <= K) { // K만큼 반복
    if (innerK === K) {
      resultArray.push(peopleArray[index]); // K만큼 이동하고 그 자리의 숫자를 resultArray에 저장
      peopleArray.splice(index, 1);         // 원래 배열에서는 삭제
      break;
    }
    index = (index + 1) % peopleArray.length; // 인덱스 증가
    innerK++;                                 // 내부 K 증가
  }
}
console.log("<" + resultArray.join(", ") + ">");