package recursao.excecao;

import java.util.Scanner;

public class Numero5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Recebe o número do usuário
            System.out.println("Digite um número para calcular a raiz quadrada:");
            double numero = scanner.nextDouble();

            // Função para calcular a raiz quadrada dentro do main
            if (numero < 0) {
                throw new IllegalArgumentException("Número negativo: Não é possível calcular a raiz quadrada.");
            }
            double resultado = Math.sqrt(numero);

            // Exibe o resultado
            System.out.println("A raiz quadrada de " + numero + " é: " + resultado);

        } catch (IllegalArgumentException e) {
            // Captura e trata a exceção IllegalArgumentException
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o scanner e finaliza o programa
            scanner.close();
            System.out.println("Fim do programa.");
        }
    }
}