
const entradas = [5, 50, 10, 98, 23];

let i = 0;

function gets() {
    const valor = entradas[i];
    i++;
    return valor;
}

function maior() {
    let maiorValor = entradas[0];
    for (let j = 1; j < entradas.length; j++ ){
        if(entradas[j] > maiorValor) {
            maiorValor = entradas[j];
        }
    }
    return maiorValor;
}

function print(text) {
    console.log(text);
}

module.exports = { gets, print, maior };