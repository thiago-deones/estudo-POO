package reviscaoProva.excecao;

//Implemente um programa que peça dois números inteiros e tente realizar
//uma divisão. Trate a exceção de divisão por zero utilizando try-catch

import java.util.Scanner;

import java.util.Scanner;

public class N1 {
    public static double dividir(int num1, int num2) {
        return num1 / num2; // Deixe a exceção ocorrer naturalmente
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero da divisão (dividendo):");
            int dividendo = scanner.nextInt();
            System.out.println("Digite o segundo numero da divisão (divisor):");
            int divisor = scanner.nextInt();

            // Tenta realizar a divisão
            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            // Trate a exceção de divisão por zero
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {
            scanner.close();
            System.out.println("Fim do programa.");
        }
    }
}