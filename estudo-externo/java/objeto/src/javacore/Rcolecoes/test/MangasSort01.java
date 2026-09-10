package javacore.Rcolecoes.test;

import javacore.Rcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangasSort01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(2L, "Bersek", 12d));
        mangas.add(new Manga(3L, "Pokemon", 13.7));
        mangas.add(new Manga(21L, "Amizade amor e carinho", 13.5));
        mangas.add(new Manga(24L, "Attack on titon", 11.8));
        mangas.add(new Manga(5L, "Digimon", 99d));
        mangas.add(new Manga(7L, "Naruto", 15d));

        System.out.println("--- Lista na ordem de inserção ---");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("\n--- Lista ordenada com Comparable (Ordem Natural) ---");
        // Usa o compareTo() sobrescrito dentro da classe Manga (ex: por Nome)
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("\n--- Lista ordenada com Comparator (Por ID) ---");
        // Usa a regra customizada da classe MangaByIdComparator
        Collections.sort(mangas, new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}