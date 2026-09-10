package javacore.Dintroducao;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        teste(a, b);
        input.close();
    }

    public static void teste(int a, int b) {
        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }
        if (a % b ==0) {
            System.out.printf("Sao Mutiplos");
        } else {
            System.out.printf("Nao sao Mutiplos");
        }
    }


}
