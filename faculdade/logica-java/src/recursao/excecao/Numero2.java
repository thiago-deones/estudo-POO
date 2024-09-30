package recursao.excecao;

//Peça ao usuário para digitar um número. Trate a exceção caso o usuário
//insira algo que não seja um número.

import java.util.Scanner;

public class Numero2 {
    public static void main(String[] args) {
        // Criar o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário digite um número
        System.out.println("Por favor, digite um número: ");
        String entrada = scanner.nextLine();  // Captura a entrada como uma string

        // Tentar converter a entrada para um número
        try {
            int numero = Integer.parseInt(entrada);  // Tenta converter para número inteiro
            System.out.println("Você digitou o número: " + numero);
        } catch (NumberFormatException e) {
            // Exceção lançada se a entrada não for um número
            System.out.println("Erro: '" + entrada + "' não é um número válido.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
