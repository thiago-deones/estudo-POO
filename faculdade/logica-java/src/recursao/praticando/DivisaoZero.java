package recursao.praticando;

//Implemente um programa que peça dois números inteiros e tente realizar
//uma divisão. Trate a exceção de divisão por zero utilizando try-catch.

import java.util.Scanner;

public class DivisaoZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro numero(dividendo)");
            int dividendo = scanner.nextInt();

            System.out.println("Digite o segundo numero(divisor)");
            int divisor = scanner.nextInt();

            double resultado = dividir(dividendo, divisor);

            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não permitida");
        } finally {
            scanner.close();
            System.out.println("Programa finalizado!");
        }
    }
    public static double dividir(int dividendo, int divisor) throws ArithmeticException{
        if(divisor == 0 ) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }

        return (double) dividendo/divisor;
    }
}


