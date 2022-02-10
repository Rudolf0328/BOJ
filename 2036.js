let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let count = input[0];
let arrayMinus = [];
let arrayPlus = [];
let total = 0;

for (let i = 1; i < input.length; i++) {
  if (input[i] !== '') {
    if(input[i] == 1) total += 1;
    else {
      if(input[i] > 0) {
        arrayPlus.push(Number(input[i]));
      } else {
        arrayMinus.push(Number(input[i]));
      }
    }
  }
}

arrayMinus.sort((a, b) => a - b);
arrayPlus.sort((a, b) => b - a);

for(let i = 0; i < arrayMinus.length; i++) {
  if(i+1 == arrayMinus.length) {
    total += Number(arrayMinus[i]);
  } else {
    total += arrayMinus[i] * arrayMinus[i+1];
    i++
  }
}

for(let i = 0; i < arrayPlus.length; i++) {
  if(i+1 == arrayPlus.length) {
    total += Number(arrayPlus[i]);
  } else {
    total += arrayPlus[i] * arrayPlus[i+1];
    i++
  }
}

console.log(total)