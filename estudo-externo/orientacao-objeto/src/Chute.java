import java.util.Random;
import java.util.Scanner;

public class Chute {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int chute = 0;

        while (tentativas < 5) {
            System.out.println("Digite um numero");
            chute = scanner.nextInt();
            tentativas++;

            if (chute == numeroAleatorio) {
                System.out.println("Você acertou o número aleatorio é : " + numeroAleatorio + " voc~e utilizou " + chute + " chutes");
                break;
            } else if (chute > numeroAleatorio) {
                System.out.println("número aleatorio é menor do que o gerado");
            } else {
                System.out.println("O numero aleatorio é maior do que o chutado");
            }
        }

        if (tentativas == 5 && chute  != numeroAleatorio) {
            System.out.printf("Voce nao conseguiu acertar");
        }

        System.out.println(numeroAleatorio);
    }
}
