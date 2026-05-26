let nomeHeroi = "Pedro";
let XPHeroi = 9001;
console.log("Ola " + nomeHeroi + "! ");
// Verificar a experiência do herói
// XP < 1000/ferro < 2000 bonze < 5000 prata < 6000 ouro < 8000 platina  < 9000 ascendente < 10000 imortal < 10001 Radiante.

if (XPHeroi <= 1000) {
    console.log("O herói de nome " + nomeHeroi + " é Ferro!");
} else if (XPHeroi <= 2000) {  
    console.log("O herói de nome " + nomeHeroi + " é Bronze!");
} else if (XPHeroi <= 5000) {  
    console.log("O herói de nome " + nomeHeroi + " é Prata!");
} else if (XPHeroi <= 6000) {
    console.log("O herói de nome " + nomeHeroi + " é Ouro!");
} else if (XPHeroi <= 8000) {  
    console.log("O herói de nome " + nomeHeroi + " é Platina!");
} else if (XPHeroi <= 9000) {  
    console.log("O herói de nome " + nomeHeroi + " é Ascendente!");
} else if (XPHeroi <= 10000) {  
    console.log("O herói de nome " + nomeHeroi + " é Imortal!");
} else  {  
    console.log("O herói de nome " + nomeHeroi + " é Radiante!");
}