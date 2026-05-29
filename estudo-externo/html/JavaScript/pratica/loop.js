var a = parseInt(gets());
var N = parseInt(gets());

let total = 0;

for(let i = a; i <= N.length; i++) {
  if(i % a === 0) {
    total += i;
  }
}

print(total)