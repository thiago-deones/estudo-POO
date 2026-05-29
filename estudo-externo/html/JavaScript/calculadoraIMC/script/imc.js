const calcular = document.getElementById("calcular");

function imc() {
    const nome = document.getElementById("nome").value;
    let altura = document.getElementById("altura").value;
    let peso = document.getElementById("peso").value;
    const resultado = document.getElementById("resultado");

    if (nome !== '' && altura !== '' && peso !== '') {
        altura = parseFloat(altura.replace(',', '.'));
        peso = parseFloat(peso.replace(',', '.'));

        const  valorIMC = (peso / (altura * altura)).toFixed(2);

        let classificacao = '';
        if (valorIMC < 18.5) {
            classificacao = 'Abaixo do peso';
        } else if (valorIMC < 25) {
            classificacao = 'Peso normal';
        } else if (valorIMC < 30) {
            classificacao = 'Sobrepeso';
        } else if (valorIMC < 35) {
            classificacao = 'Obesidade grau 1';
        } else if (valorIMC < 40) {
            classificacao = 'Obesidade grau 2';
        } else {
            classificacao = 'Obesidade grau 3';
        }

        resultado.textContent = `Olá ${nome}, seu IMC é ${valorIMC} e você está ${classificacao}.`;

    } else {
        resultado.textContent = 'Preencha todos os campos!!!';
   }

}

calcular.addEventListener("click", imc); 