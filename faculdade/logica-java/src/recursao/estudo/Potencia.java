package recursao.estudo;

//algoritmo que recebe uma entrada de um numero e sua potencia

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scanner.nextInt();

        System.out.println("Digite a potencia: ");
        int potencia = scanner.nextInt();

        int resultado = calculo(base, potencia);

        System.out.println("O número " + base + " elevado a potencia de " + potencia + " é igual a " + resultado + ".");
    }

    private static int calculo(int base, int potencia) {
        if (potencia ==  1){
            return base;
        }

        return base * calculo(base, potencia-1);


    }
}
