package listaCircular;

public class Main {
    public static void main(String[] args){
        ListaCircular<String> minhaListacircular = new ListaCircular<>();

        minhaListacircular.add("c0");
        System.out.println(minhaListacircular);

        minhaListacircular.remove(0);
        System.out.println(minhaListacircular);

        minhaListacircular.add("c1");
        minhaListacircular.add("c2");
        minhaListacircular.add("c3");
    }
}
