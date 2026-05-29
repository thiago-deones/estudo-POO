class Carro {
    constructor(marca, cor, autonomia) {
        this.marca = marca;
        this.cor = cor;
        this.autonomia = autonomia;
    }

    calcularAutonomia(distancia, valorCombustivel) {
        const resultado = distancia * this.autonomia * valorCombustivel
        return Number(resultado.toFixed(1));
    } 
}

let carro1 = new Carro("Fusca", "azul", 1/10);
let carro2 = new Carro("Civic", "preto", 1/15);

console.log(carro1.calcularAutonomia(100, 5));
console.log(carro2.calcularAutonomia(100, 5));
