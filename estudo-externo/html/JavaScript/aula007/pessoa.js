class Pessoa {
    nome;
    peso;
    altura;
    
    constructor(nome, peso, altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    calcularIMC() {
        const imc = this.peso / (this.altura * this.altura);
        return imc.toFixed(2);
    }
}

const Jose = new Pessoa("José", 70, 1.75);

console.log(Jose.calcularIMC());