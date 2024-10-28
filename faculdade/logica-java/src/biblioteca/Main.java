package biblioteca;

public class Main {
    public static void main(String[] args) {
        // Criando um livro e uma revista
        Livro livro = new Livro("O Senhor dos Anéis", 1954);
        Revista revista = new Revista("National Geographic", 2022);

        // Criando empréstimos
        Emprestimo emprestimoCurto = new EmprestimoCurtoPrazo(livro, 5);
        EmprestimoCurtoPrazo emprestimoRevista = new EmprestimoCurtoPrazo(revista, 10);

        // Exibindo as multas calculadas
        System.out.printf("Multa para o livro: R$ %.2f%n", emprestimoCurto.calcularMulta());
        System.out.printf("Multa para a revista: R$ %.2f%n", emprestimoRevista.calcularMulta());
    }
}
