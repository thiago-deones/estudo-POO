import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            // Exibindo o menu de opções
            System.out.println("Escolha uma opção:");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Consultar Saldo");
            System.out.println("0: Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Solicitar o valor a ser depositado
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;  // Atualizar o saldo com o valor depositado
                    System.out.printf("Saldo atual: %.1f%n", saldo);  // Imprimir o saldo atual com uma casa decimal
                    break;

                case 2:
                    // Solicitar o valor a ser sacado
                    System.out.print("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;  // Atualizar o saldo se houver fundos suficientes
                        System.out.printf("Saldo atual: %.1f%n", saldo);  // Imprimir o saldo atual com uma casa decimal
                    } else {
                        System.out.println("Saldo insuficiente.");  // Mensagem de saldo insuficiente
                    }
                    break;

                case 3:
                    // Exibir o saldo atual
                    System.out.printf("Saldo atual: %.1f%n", saldo);  // Imprimir o saldo atual com uma casa decimal
                    break;

                case 0:
                    // Encerrar o programa
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Terminar o loop
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
