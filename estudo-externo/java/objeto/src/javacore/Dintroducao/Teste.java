package javacore.Dintroducao;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double N1 = input.nextDouble();
        double N2 = input.nextDouble();
        double N3 = input.nextDouble();
        double N4 = input.nextDouble();

        N1 *= 2;
        N2 *= 3;
        N3 *= 4;
        N4 *= 1;
        double media = (N1 + N2 + N3 + N4) / 10;

        if (media >= 7) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        } else {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            double exame = input.nextDouble();
            double notaFInal = (exame + media) / 2;
            if (notaFInal >= 5) {
                System.out.printf("Nota do exame: %.1f%n", exame);
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", notaFInal);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", notaFInal);
            }

        }

        input.close();
    }

    public static void tempoJogo(double N1, double N2, double N3, double N4) {


    }

}
