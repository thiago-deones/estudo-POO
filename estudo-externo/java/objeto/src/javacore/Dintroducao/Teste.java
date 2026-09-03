package javacore.Dintroducao;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tempo = input.nextInt();
        int velocidade = input.nextInt();

        double distancia= (tempo*velocidade)/12.0;
        System.out.printf("%.3f%n",distancia);
        input.close();
       }
    }