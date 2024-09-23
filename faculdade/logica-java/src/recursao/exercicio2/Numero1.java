package recursao.exercicio2;

//Escreva uma função recursiva que retorne a soma dos dígitos de um
//número inteiro

import java.util.Scanner;

public class Numero1 {
    public static int somaDigitos(int n) {
        if(n == 0){
            return 0;
        }
        return (n % 10) + somaDigitos(n/10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero que sera somado todos os seus digitos:");
        int numero = scanner.nextInt();

        System.out.printf("%n A soma dos digitos do número %d é %d.", numero, somaDigitos(numero));
    }
}
