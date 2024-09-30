package recursao.praticando.excecao;

//Implemente um programa que peça dois números inteiros e tente realizar
//uma divisão. Trate a exceção de divisão por zero utilizando try-catch.

import java.util.Scanner;

public class Numero1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o dividendo da opéração");
            int dividendo = scanner.nextInt();

            System.out.println("Digite o divisor da operação");
            int divisor = scanner.nextInt();

            double resultado = dividir(dividendo, divisor);
            System.out.println(resultado);
        } catch(ArithmeticException e){
            System.out.println("Erro: Não é possível dividir por zero.");
        } finally {
            scanner.close();
            System.out.println("Fim do programa!");
        }
    }

    public static double dividir(int dividendo, int divisor) throws ArithmeticException{
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return (double) dividendo/divisor;
    }
}
