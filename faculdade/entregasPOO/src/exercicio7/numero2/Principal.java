package exercicio7.numero2;

public class Principal {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Matemática", 60);
        Disciplina d2 = new Disciplina("História", 45);

        Aluno2 a1 = new Aluno2("Pedrinho", 12345, 6, 8, 5, 4, 8, d1);
        Aluno2 a2 = new Aluno2("Joanita", 12151, 4, 4, 0, 10, 8, d2);

        a1.situacaoAluno();
        a2.situacaoAluno();
    }
}
