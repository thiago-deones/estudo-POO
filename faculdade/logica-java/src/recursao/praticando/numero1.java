package recursao.praticando;

import java.util.Scanner;

public class numero1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um numero interio ");
        int numero = scanner.nextInt();

        System.out.printf("%n A soma dos digitos do número %d é %d.", numero, somaDigitos(numero));
    }

    public static int somaDigitos(int n){
        if(n == 0){
            return 0;
        }

        return (n % 10) + somaDigitos(n/10);
    }
}
