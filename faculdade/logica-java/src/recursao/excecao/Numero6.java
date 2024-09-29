package recursao.excecao;

import java.util.Scanner;

public class Numero6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int dividendo = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int divisor = scanner.nextInt();

            double resultadoDivisao = dividir(dividendo, divisor);
            System.out.printf("Resultado da divisão: %.2f%n", resultadoDivisao);

            int[] array = {1, 2, 3, 4, 5};

            System.out.print("Digite um índice para acessar o array: ");
            int indice = scanner.nextInt();

            int valorArray = acessarArray(array, indice);
            System.out.printf("Valor no índice %d: %d%n", indice, valorArray);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return (double) dividendo / divisor;
    }

    public static int acessarArray(int[] array, int indice) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fora dos limites do array.");
        }
        return array[indice];
    }
}
