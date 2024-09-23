package recursao.exercicio2;

//Escreva uma função recursiva que calcule a potência de um número, dado
//a base e o expoente.

import java.util.Scanner;

public class Numero2 {

    public static int calcularPotencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        } else {
            expoente = expoente - 1;
            return base * calcularPotencia(base,expoente);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para calcular a potência:  ");
        int base = scanner.nextInt();

        System.out.println("Digite a potencia");
        int potencia = scanner.nextInt();

        System.out.println(calcularPotencia(base,potencia));

    }
}
