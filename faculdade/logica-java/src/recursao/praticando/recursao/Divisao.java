package recursao.praticando.recursao;

//Implemente um metodo recursivo que receba como entrada um número inteiro
//positivo N e retorne o seguinte cálculo: 1 + 1/1 + 1/2 + 1/3 + 1/n

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int num = scanner.nextInt();

        double resultado = divisao(num);

        System.out.printf("O resultado da série até 1/%d é: %.4f%n", num, resultado);

        scanner.close();
    }

    public static double divisao(int n){
        if(n == 1){
            return 1.0; // Caso base: quando n for 1, retornar 1.0
        }

        return 1.0 / n + divisao(n - 1); // Somar o inverso de n com a chamada recursiva
    }
}