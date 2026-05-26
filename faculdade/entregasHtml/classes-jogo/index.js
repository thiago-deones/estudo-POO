class Heroi {
    constructor(nome, idade, tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    atacar() {
        let ataque;
        switch (this.tipo) {
            case "mago":
                ataque = "usou magia!";
                break;
            case "guerreiro":
                ataque = "usou espada!";
                break;
            case "monge":
                ataque = "usou artes marciais!";
                break;
            case "ninja":
                ataque = "usou shuriken!";
                break;
            default:
                ataque = "não tem um ataque definido!";
        }

        console.log(`O ${this.tipo}, atacou usando ${ataque}`);
    }
};

const jogador =  new Heroi('Pedro', 30, 'mago');
const jogador2 = new Heroi('Maria', 22, 'ninja')
jogador.atacar();
jogador2.atacar();