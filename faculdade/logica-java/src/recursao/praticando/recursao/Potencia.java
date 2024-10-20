package recursao.praticando.recursao;

// Implemente um metodo recursivo que receba como entrada dois números inteiros x e
//k e retorne o valor da operação x elevado a k

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a base");
        int base = scanner.nextInt();

        System.out.println("Escreva a potencia");
        int potencia = scanner.nextInt();

        int resultado = potencia(base, potencia);

        System.out.println(resultado);
    }

    public static int potencia(int base, int potencia) {
        if(potencia == 1){
            return base;
        } else {
            potencia = potencia -1;
            return base * potencia(base, potencia);
        }
    }
}
