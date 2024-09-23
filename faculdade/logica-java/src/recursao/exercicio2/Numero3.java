package recursao.exercicio2;

//Implemente uma função recursiva que inverta uma string.

import java.util.Scanner;

public class Numero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar uma string
        System.out.println("Digite uma string para inverter:");
        String texto = scanner.nextLine();

        // Chama a função recursiva para inverter a string e exibe o resultado
        String inverted = inverterString(texto);
        System.out.println("String invertida: " + inverted);
    }

    // Função recursiva para inverter uma string
    public static String inverterString(String palavras) {
        // Caso base: se a string for vazia ou tiver apenas 1 caractere, retorna a própria string
        if (palavras.isEmpty()) {
            return palavras;
        }

        // Toma o último caractere da string e o junta ao resultado da inversão do restante da string
        return inverterString(palavras.substring(1)) + palavras.charAt(0);
    }
}
