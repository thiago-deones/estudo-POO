class pessoa {
    nome;
    idade;

    descrever() {
        console.log(`Meu nome é ${this.nome}, eu tenho ${this.idade} anos.`)
    }
}

const vitor = new pessoa();
vitor.nome = "Vitor";
vitor.idade = 22;
vitor.descrever();

const lucas = new pessoa();
lucas.nome = "lucas";
lucas.idade = 23;
lucas.descrever();

function compararIdade(p1, p2) {
    if (p1.idade > p2.idade) {
        console.log(`${p1.nome} é mais velho(a) que ${p2.nome}`)
    } else if (p1.idade < p2.idade) {
        console.log(`${p2.nome} é mais velho(a) que ${p1.idade}`)
    } else {
        console.log(`${p1.nome} e ${p2.nome} tem a mesma idade`)
    }
}