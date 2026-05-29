/*const alunos = ['João', 'Maria', 'José', 'Ana', 'Pedro'];

alunos.push('Lucas');//adicionando no final

alunos.unshift('Carlos');//adicionando no começo

//alunos.pop();//removendo do final

alunos.shift();//removendo do começo

alunos[2] = 'Marcos';//substituindo do meio

//alunos.splice(2, 1);//removendo do meio

//alunos.splice(2, 0, 'Lucas');//adicionando no meio
//alunos.splice(2, 1, 'Lucas');//substituindo do meio
console.log(alunos);
*/
const notas = [];

notas.push(10);
notas.push(3);
notas.push(5);
notas.push(7);
notas.push(9);

let soma = 0;

for (let i = 0; i < notas.length; i++) {
    soma += notas[i];
}

let soma2 = notas.reduce((acumulador, nota) => acumulador + nota, 0);

console.log(soma);

console.log('A média é: ' + (soma/notas.length).toFixed(2));




const nome = 'Thiago';

for (let i = 0; i < nome.length; i++) {

    console.log(nome[i]);

}