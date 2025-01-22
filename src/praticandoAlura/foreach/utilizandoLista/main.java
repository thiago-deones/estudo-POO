package praticandoAlura.foreach.utilizandoLista;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> linguagens = new ArrayList<>();
        linguagens.add("java");
        linguagens.add("C");
        linguagens.add("python");

        for (String element : linguagens) {
            System.out.println(element);
        }
    }
}
