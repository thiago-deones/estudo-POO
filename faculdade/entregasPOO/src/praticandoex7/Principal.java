package praticandoex7;

public class Principal {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Pedro", 13214, 4, 6, 7, 8, 10);

        a1.calcularMedia();
        a1.situacaoAluno();
        a1.exibirSituacaoAluno();
    }
}
