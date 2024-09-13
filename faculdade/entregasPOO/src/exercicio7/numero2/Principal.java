package exercicio7.numero1;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedrinho", 12345, 6,8,5,4,8);
        Aluno a2 = new Aluno("Joanita", 12151, 4,4,0,10,8);

        a1.situacaoAluno();
        a2.situacaoAluno();
    }
}
