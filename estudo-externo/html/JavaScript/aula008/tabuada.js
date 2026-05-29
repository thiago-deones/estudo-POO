for (let i = 0; i <= 10; i++) {

    let tabuada = 5;
    let resultado = tabuada * i;
    console.log(`5 x ${i} = ${resultado}`);
    
}


const array = [1, 2, 3, 4, 5];

let pares = [];

for (let i = 0; i < array.length; i++) {
    if (array[i] % 2 === 0) {
        pares.push(array[i]);
    }
}

console.log('Os números pares são [' + pares.join(', ') + ']');