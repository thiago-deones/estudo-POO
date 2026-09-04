package javacore.Dintroducao;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dias = input.nextInt();
        int anos = dias/365;
        int resto = dias%365;
        int meses = resto/30;
        int dia = resto%30;
        System.out.printf("%d ano(s)%n", anos);
        System.out.printf("%d mes(es)%n", meses);
        System.out.printf("%d dia(s)%n", dia);

        input.close();
       }


    }