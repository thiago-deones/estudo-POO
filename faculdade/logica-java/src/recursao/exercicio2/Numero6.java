package recursao.exercicio2;

//Escreva uma função recursiva que verifique se uma string é um
//palíndromo (lê-se da mesma forma de frente para trás e vice-versa).

import java.util.Scanner;

public class Numero6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para verificar se é um palíndromo:");
        String palavra = scanner.nextLine();

        // Remover espaços em branco e converter para letras minúsculas
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        // Verifica se a palavra é um palíndromo usando a função recursiva
        boolean resultado = ehPalindromo(palavra, 0, palavra.length() - 1);

        if (resultado) {
            System.out.printf("A string '%s' é um palíndromo.%n", palavra);
        } else {
            System.out.printf("A string '%s' não é um palíndromo.%n", palavra);
        }
    }

    // Função recursiva que verifica se uma string é um palíndromo
    public static boolean ehPalindromo(String palavra, int inicio, int fim) {
        // Caso base: se os índices se cruzarem, significa que a string é um palíndromo
        if (inicio >= fim) {
            return true;
        }

        // Verifica se os caracteres nas posições 'inicio' e 'fim' são iguais
        if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false;
        }

        // Chamada recursiva: avança o índice 'inicio' e reduz o índice 'fim'
        return ehPalindromo(palavra, inicio + 1, fim - 1);
    }
}
