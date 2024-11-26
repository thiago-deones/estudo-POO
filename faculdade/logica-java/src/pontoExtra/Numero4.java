package pontoExtra;

import java.util.Scanner;

//4. Um número é dito perfeito se a soma de seus divisores próprios (exceto ele mesmo) for igual ao próprio número.
//Implemente um programa que encontre o n primeiros números perfeitos.
//
//Exemplo: 6 é perfeito porque 1 + 2 + 3 =6;


public class Numero4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int quantidade = scanner.nextInt();

        int contador = 0;
        int numero = 1;



        while (contador < quantidade) {
            if (perfeito(numero)){
                System.out.println(numero);
                contador++;
            }
            numero++;
        }


    }

    public static boolean perfeito(int n) {
        int soma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }

        return soma == n;
    }
}
