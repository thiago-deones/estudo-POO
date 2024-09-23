package praticandoex7;

public class Aluno {
    public String nome;
    public int matricul;
    public double nota_mat;
    public double nota_por;
    public double nota_fis;
    public double nota_geo;
    public double nota_quim;

    public Aluno(String nome, int matricula, double nota_fis, double nota_geo, double nota_mat, double
                 nota_por, double nota_quim) {
        this.nome = nome;
        this.matricul = matricula;
        this.nota_fis = nota_fis;
        this.nota_geo = nota_geo;
        this.nota_mat = nota_mat;
        this.nota_por = nota_por;
        this.nota_quim = nota_quim;
    }

    public double calcularMedia(){
        return (this.nota_quim+this.nota_fis+this.nota_por+this.nota_geo+this.nota_mat)/5;
    }

    public String situacaoAluno(){
        double media = calcularMedia();
        boolean aprovado = media <= 6;
        return (aprovado ? "Aprovado" : "Reprovado");
    }

    public void exibirSituacaoAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Media: " + calcularMedia());
        System.out.println("Situção: " + situacaoAluno());
    }
}
