package praticandoAlura.foreach.supermecado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 2.90);
        Produto produto2 = new Produto("Feijão", 3.8);
        Produto produto3 = new Produto("cafe", 2000);


        ArrayList<Produto> listaProduto = new ArrayList<>();

        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaProduto) {
            somaPrecos += produto.getValor();
        }

        double precoMedio = somaPrecos / listaProduto.size();
        System.out.println("Preço medio dos produtos =" + precoMedio);
    }
}
