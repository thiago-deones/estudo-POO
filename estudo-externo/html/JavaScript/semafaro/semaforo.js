const img = document.getElementById( 'img' );
const buttons = document.getElementById( 'buttons' );
let colorIndex = 0;
let interval = null;

const trafficLight = ( event ) => {
    stopAutomatic();
    turnOn[event.target.id]();
}

const nextIndex = () => colorIndex = colorIndex < 2 ? ++colorIndex : 0;


const changeColor = () => {
    const colores = ['red', 'yellow', 'green'];
    const color = colores[ colorIndex ];
    turnOn[color]();
    nextIndex();
}

const stopAutomatic = () => {
    clearInterval( interval )
}

const turnOn = {
    'red':      () => img.src = "./img/vermelho.png",
    'yellow':   () => img.src = "./img/amarelo.png",
    'green':    () => img.src = "./img/verde.png",
    'automatic':() => interval = setInterval(changeColor, 1000)
}

buttons.addEventListener( 'click', trafficLight);