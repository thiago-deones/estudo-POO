public class Combate {
    public static void main(String[] args){

        Carro c1 = new Carro("Golf");
        Carro c2 = new Carro("HRV");
        CarroCombat c3 = new CarroCombat("Leopard", 70);
        CarroCombat c4 = new CarroCombat("Leopard II", 100);

        c3.atirar();
        c3.atirar();
        c3.atirar();

        c4.sofrerDano(30);
        c1.sofrerDano(100);

        c1.info();
        c2.info();
        c3.info();
        c4.info();
    }
}
