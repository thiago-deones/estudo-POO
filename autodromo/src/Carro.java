public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    public void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }
    public void confereCambio(){
        System.out.println("Confere cambio em P");
    }
}
