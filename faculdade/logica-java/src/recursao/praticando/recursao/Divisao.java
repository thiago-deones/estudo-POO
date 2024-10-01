package recursao.praticando.recursao;

//Implemente um metodo recursivo que receba como entrada um número inteiro
//positivo N e retorne o seguinte cálculo: 1 + 1/1 + 1/2 + 1/3 + 1/n

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }

    public static double divisao(int n){
        if(n == 1){
            return 1;
        }

        return (double) n + divisao();
    }
}
