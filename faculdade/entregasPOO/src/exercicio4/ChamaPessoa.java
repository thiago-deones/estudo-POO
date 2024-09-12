package exercicio4;

public class ChamaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.cidade="sao paulo";
        p1.idade=18;
        p1.nome="Pedro";

        p2.nome="Ana";
        p2.idade=25;
        p2.cidade="Belo Horizonte";

        p1.apresentar();
    }
}
