let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().split('\n');

let count = input[0];
let numbers = [];

let countBridge = (n, m) => {
  let up = 1;
  let down = 1;

  for(let i = 0; i < n; i++) {
    up = up * (m - i);
    down = down * (n - i);
  }

  // console.log("up " + up + ", down " + down)
  return up / down;
}

for (let i = 1; i < input.length; i++) {
  if (input[i] !== '') {
    numbers.push(input[i].split(' '));
  }
}

for (let i = 0; i < numbers.length; i++){
  let n = Number(numbers[i][0]);
  let m = Number(numbers[i][1]);

  if (m/2 < n) {
    n = m - n;
  }

  console.log(countBridge(n, m))
}