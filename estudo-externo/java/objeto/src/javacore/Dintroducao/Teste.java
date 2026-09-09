package javacore.Dintroducao;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int kConsultas = input.nextInt();
            if (kConsultas == 0) {
                break;
            }

            //leste-oeste
            int nCordenada = input.nextInt();
            int mCordenada = input.nextInt();

            for (int i = 0; i < kConsultas; i++) {
                //norte-sul
                int xCordenada = input.nextInt();
                int yCordenada = input.nextInt();
                quadrante(nCordenada, mCordenada, xCordenada, yCordenada);
            }
        }

        input.close();
    }

    public static void quadrante(int n, int m, int x, int y) {
        if (x == n || y == m) {
            System.out.println("divisa");
        } else if (x > n && y > m) {
            System.out.println("NE");
        } else if (x < n && y > m) {
            System.out.println("NO");
        } else if (x > n && y < m) {
            System.out.println("SE");
        } else {
            System.out.println("SO");
        }
    }


}
