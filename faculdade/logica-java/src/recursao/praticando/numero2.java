package recursao.praticando;

import java.util.Scanner;

public class numero2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um numero:");
        int numero = scanner.nextInt();

        System.out.printf("Digite sua potencia");
        int expotencial = scanner.nextInt();

        System.out.println(potencia(numero,expotencial));
    }

    public static int potencia(int base, int potencia){
        if(potencia == 0){
            return base;
        }
        return base * potencia(base, potencia - 1);
    }
}
