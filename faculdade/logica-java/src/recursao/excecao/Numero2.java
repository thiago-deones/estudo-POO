package recursao.excecao;

//Peça ao usuário para digitar um número. Trate a exceção caso o usuário
//insira algo que não seja um número.
import java.util.Scanner;

public class Numero2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = lerNumero(scanner);
            System.out.printf("Você digitou: %d%n", numero);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Você não digitou um número válido.");
        } finally {
            scanner.close();
        }
    }

    public static int lerNumero(Scanner scanner) throws NumberFormatException {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Entrada inválida. Não é um número.");
        }

    }
}