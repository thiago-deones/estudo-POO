package praticandoex7;

public class Principal {
    public static void main(String[] args){
        Disciplina d1 = new Disciplina("Portugues", 60);
        Aluno a1 = new Aluno("Pedro", 13214, 4, 6, 7, 8, 10, d1);

        a1.calcularMedia();
        a1.situacaoAluno();
        a1.exibirSituacaoAluno();
    }
}
