package recursao.estudo;

//criar uma função q verifica se a palavra é palindromo ou n


public class Palindromo {
    public static void main(String[] args) {
        String palavra1 = "ovo";
        String palavra2 = "foca";

        if (ehPalindromo(palavra1, 0, palavra1.length() - 1)) {
            System.out.println("A palavra " + palavra1 + " é palindromo");
        } else {
            System.out.println("A palavra " + palavra1 + " não é palindromo");
        }

        if (ehPalindromo(palavra2, 0, palavra2.length() - 1)) {
            System.out.println("A palavra " + palavra2 + "é palindromo");
        } else {
            System.out.println("A palavra " + palavra2 + "não é palindromo");
        }
    }

    public static boolean ehPalindromo (String palavra, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }

        if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false;
        }

        return ehPalindromo(palavra, inicio + 1, fim -1);
    }
}
