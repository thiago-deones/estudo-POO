//variáveis da bolinha
let xBolinha = 300;
let yBolinha = 200;
let diametro = 15;
let raio = diametro / 2 ;

//velocidade da bolinha
let velocidadeXBolinha = 6;
let velocidadeYBolinha = 6;
let raqueteComprimento = 10;
let raqueteAltura = 90;

//variáveis da raquete
let xRaquete = 5;
let yRaquete = 150;

//variáveis do oponente
let xRaqueteOponente = 585;
let yRaqueteOponente = 150;
let velocidadeYOponente;

let colidiu = false;

//placar do jogo
let meusPontos = 0;
let pontosDoOponente = 0;

function setup() {
  createCanvas(600, 400);
}

function draw() {
  background(0);
  line(width/2, 0, width/2, height);
  mostraBolinha();
  movimentaBolinha();
  verificaColisaoBorda();
  mostraRaquete(xRaquete, yRaquete);
  movimentaMinhaRaquete();
  verificaColisaoRaquete(xRaquete, yRaquete, raqueteComprimento, raqueteAltura);
  mostraRaquete(xRaqueteOponente, yRaqueteOponente);
  movimentaRaqueteOponente();
  verificaColisaoRaquete(xRaqueteOponente, yRaqueteOponente, raqueteComprimento, raqueteAltura);
  incluiPlacar();
  marcaPonto();
  bolinhaNaoFicaPresa();
}

function mostraBolinha(){
  circle(xBolinha, yBolinha, diametro);
}

function movimentaBolinha(){
  xBolinha += velocidadeXBolinha;
  yBolinha += velocidadeYBolinha;
}

function verificaColisaoBorda(){
  if (xBolinha + raio> width ||
     xBolinha - raio< 0){
    velocidadeXBolinha *= -1;
  }
  if (yBolinha + raio> height ||
     yBolinha - raio < 0){
    velocidadeYBolinha *= -1;
  }
}

function mostraRaquete(x,y){
  rect(x, y, raqueteComprimento, 
      raqueteAltura);
}

function movimentaMinhaRaquete(){
  if (keyIsDown(UP_ARROW) && yRaquete > 0){
    yRaquete -= 10;
  }
  if (keyIsDown(DOWN_ARROW) && yRaquete + raqueteAltura < height){
    yRaquete += 10;
  }
}
function verificaColisaoRaquete(x, y, w, h){
  let distanciaX = abs(xBolinha - max(x, min(xBolinha, x + w)));
  let distanciaY = abs(yBolinha - max(y, min(yBolinha, y + h)));

  if (distanciaX <= raio && distanciaY <= raio) {
    velocidadeXBolinha *= -1;
  }
}

function movimentaRaqueteOponente(){
    velocidadeYOponente = yBolinha - yRaqueteOponente - raqueteComprimento / 2 - 50;
    yRaqueteOponente += velocidadeYOponente;
  
}

function incluiPlacar(){
  stroke(255);
  textAlign(CENTER);
  textSize(17);
  fill(color(255, 140, 0));
  rect(150, 12, 40, 20);
  fill(255);
  text(meusPontos, 170, 30);
  fill(color(255, 140, 0));
  rect(450, 12, 40, 20);
  fill(255);
  text(pontosDoOponente, 470, 30);
}

function marcaPonto(){
  if (xBolinha > 590){
    meusPontos += 1;
  }
  if (xBolinha < 10){
    pontosDoOponente += 1;
  }
}

function bolinhaNaoFicaPresa(){
    if (xBolinha - raio < 0){
    xBolinha = raio;
    }
}