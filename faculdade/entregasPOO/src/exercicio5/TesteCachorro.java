package exercicio5;

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("pug", 0.30,"cinza", false);
        Cachorro c2 = new Cachorro("dalmata", 0.80,"branco com bolinhas prettas", true);

        c1.late();
        c2.late();
    }
}
