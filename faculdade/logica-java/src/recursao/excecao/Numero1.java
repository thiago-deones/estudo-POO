package recursao.excecao;

//Implemente um programa que peça dois números inteiros e tente realizar
//uma divisão. Trate a exceção de divisão por zero utilizando try-catch.

import java.util.Scanner;

public class Numero1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número (dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.println("Digite o segundo número(divisor):");
            int divisor = scanner.nextInt();

            double resultado = dividir(dividendo, divisor);

            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        finally {
            scanner.close();
            System.out.println("Fim do programa!");
        }
    }
    public static double dividir(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return (double) num1 / num2;
    }
}
