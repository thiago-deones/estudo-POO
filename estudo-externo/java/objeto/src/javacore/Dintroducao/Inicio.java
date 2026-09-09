package javacore.Dintroducao;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();

        quadrante(x,y);

        input.close();
    }

    public static void quadrante(double a, double b) {
        if (a == 0 && b == 0) {
            System.out.println("Origem");
        } else if (b == 0) {
            System.out.println("Eixo X");
        } else if (a == 0) {
            System.out.println("Eixo Y");
        } else if (a < 0 && b < 0) {
            System.out.println("Q3");
        } else if (a > 0 && b > 0) {
            System.out.println("Q1");
        } else if (a < 0 && b > 0) {
            System.out.println("Q2");
        } else if (a > 0 && b < 0) {
            System.out.println("Q4");
        }
    }
}
