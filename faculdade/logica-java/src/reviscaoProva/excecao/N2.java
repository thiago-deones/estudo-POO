package reviscaoProva.excecao;

//Peça ao usuário para digitar um número. Trate a exceção caso o usuário
//insira algo que não seja um número.

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        String numEntrada = scanner.nextLine();

        try{
            int numero = Integer.parseInt(numEntrada);
            System.out.println("Voce digitou o numero: " + numero);
        } catch (NumberFormatException e){
            System.out.println("Voce não digitou um número");
        } finally {
            scanner.close();
            System.out.println("Fim do programa");
        }
    }
}
