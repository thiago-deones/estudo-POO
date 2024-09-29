package recursao.exercicio2;

//Escreva uma função recursiva que verifique se uma string é um
//palíndromo (lê-se da mesma forma de frente para trás e vice-versa).

import java.util.Scanner;

public class Numero6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para verificar se é um palíndromo:");
        String palavra = scanner.nextLine();

        // Verifica se a palavra é um palíndromo usando a função recursiva
        boolean resultado = ehPalindromo(palavra, 0, palavra.length()-1);

        if (resultado) {
            System.out.printf("A string '%s' é um palíndromo.%n", palavra);
        } else {
            System.out.printf("A string '%s' não é um palíndromo.%n", palavra);
        }
    }

    // Função recursiva que verifica se uma string é um palíndromo
    public static boolean ehPalindromo(String palavra, int i, int f) {
        if(i == f){
            return true;
        }
        if(i == f-1){
            return palavra.charAt(i) == palavra.charAt(f);
        }
        if(palavra.charAt(i) == palavra.charAt(f)){
            return ehPalindromo(palavra,i+1, f-1);
        } else {
            return false;
        }
    }
}
