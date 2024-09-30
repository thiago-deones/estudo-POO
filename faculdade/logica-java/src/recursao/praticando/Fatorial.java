package recursao.praticando;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de fatorial desejado");
        int numero = scanner.nextInt();

        // Verifica se o número é válido para calcular o fatorial
        if (numero <= 0) {
            System.out.println("Número inválido. O número deve ser maior que zero.");
        } else {
            // Calcula o fatorial chamando o metodo
            int fatorial = factR(numero);
            System.out.printf("O fatorial de %d é %d%n", numero, fatorial);
        }
    }

    public  static int factR(int n){
        int result;
        if(n == 1){
            return 1;
        }
        //executa a chamada recursiva a factR().
        result = factR(n-1) * n;
        return result;
    }
}
