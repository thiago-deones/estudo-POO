package praticandoAlura.animais;

public class TesteAnimal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        gato.arranhar();
        gato.emitirSom();
        cachorro.abanarRabo();
        cachorro.emitirSom();
    }
}
