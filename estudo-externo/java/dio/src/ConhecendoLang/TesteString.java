package ConhecendoLang;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Alura";// objeto literal
        // String outro = new String("Alura");

        String outra = nome.replace("A", "a");

        System.out.println(outra);

        String outra1 = nome.toLowerCase();

        System.out.println(outra1);

    }
}
