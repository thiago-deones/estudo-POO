package recursao;

import java.util.Scanner;

public class Fibonaci {
    public static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para calcular fibonacci:");
        int numero = scanner.nextInt();

        System.out.println(fibo(numero));
    }
}
