package javacore.Rcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("thiago");
        nomes.add("dev");


        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("_______________");
        nomes.add("suane");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
            System.out.println("Posição: " + i );
        }
    }
}
