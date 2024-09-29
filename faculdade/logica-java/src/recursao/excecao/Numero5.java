package recursao.excecao;

import java.util.Scanner;

public class Numero5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número para calcular a raiz quadrada: ");
            double numero = scanner.nextDouble();

            double resultado = calcularRaizQuadrada(numero);
            System.out.printf("A raiz quadrada de %.2f é %.2f%n", numero, resultado);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Programa finalizado!");
        }
    }

    public static double calcularRaizQuadrada(double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
        }

        return Math.sqrt(numero);
    }
}