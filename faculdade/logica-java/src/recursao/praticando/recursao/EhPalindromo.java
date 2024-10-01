package recursao.praticando.recursao;

//descobrir se a palavra é ou não palindromo utilizando a recursividade

import java.util.Scanner;

public class EhPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra para verificar se ela é ou não palindromo");
        String palavra = scanner.nextLine();

        boolean testa = ehPalindromo(palavra, 0, palavra.length()-1);

        System.out.println(testa);
    }



    public static Boolean ehPalindromo(String palavra, int i, int f){
        if (i == f){
            return true;
        }
        if (i == f-1) {
            return palavra.charAt(i) == palavra.charAt(f);
        }
        if (palavra.charAt(i) == palavra.charAt(f)){
            return ehPalindromo(palavra, i +1, f-1);
        } else {
            System.out.println("não é palindromo");
            return false;
        }
    }
}
