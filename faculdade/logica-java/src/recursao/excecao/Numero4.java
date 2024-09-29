package recursao.excecao;

import java.util.Scanner;

public class Numero4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            if(idade < 0 || idade > 150 ){
                throw new IdadeInvalidaException("Idade invalida!A idade deve estar entre 0 e 150 anos");
            }
            System.out.printf("Idade válida: %d anos.%n", idade);
        } catch (IdadeInvalidaException e){
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem){
        super(mensagem);
    }
}