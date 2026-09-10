package javacore.Rcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Bersek");
        mangas.add("Pokemon");
        mangas.add("Amizade amor e carinho");
        mangas.add("Attack on titon");
        mangas.add("Digimon");
        mangas.add("Naruto");

        Collections.sort(mangas);

        List<Double> dinheiro = new ArrayList<>();
        dinheiro.add(12.3);
        dinheiro.add(1d);
        dinheiro.add(22d);
        dinheiro.add(2d);

        Collections.sort(dinheiro);

        for (String i : mangas) {
            System.out.println(i);

        }

        for (Double v : dinheiro) {
            System.out.println(v);
        }


    }
}
