let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let length = input[0];
let arrayA = [];
let arrayP = [];

arrayA = input[1].split(' ');
let arrayB = arrayA.slice();

arrayB.sort((a, b) => a - b);

for(let i = 0; i < length; i++) {
  let p = arrayB.indexOf(arrayA[i])
  arrayB[p] = -1;
  arrayP.push(p);
}

console.log(arrayP.join(" "));