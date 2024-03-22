let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString();

const shiftChar = (char, offset) => {
  const charCode = char.charCodeAt(0);
  const base = charCode >= 65 && charCode <= 90 ? 65 : charCode >= 97 && charCode <= 122 ? 97 : null;
  return base !== null ? String.fromCharCode(((charCode - base + offset) % 26) + base) : char;
};

const ans = input.split('').map(char => shiftChar(char, 13)).join('');

console.log(ans);