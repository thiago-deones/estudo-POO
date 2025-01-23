package Alura.src.praticandoAlura.arrayProduto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto p1 = new Produto("farinha", 13.9, 2);
        Produto p2 = new Produto("Peixe", 40.50,20);


        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);

        System.out.println("O tamanho da lista é de " + listaDeProdutos.size());
        System.out.println("O primeiro produto da lista é " + listaDeProdutos.get(0).getNome());

        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

    }
}
