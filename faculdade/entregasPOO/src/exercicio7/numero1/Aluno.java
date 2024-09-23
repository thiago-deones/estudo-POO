package exercicio7.numero1;

public class Aluno {
    public String nome;
    public int matricula;
    public double notaPor;
    public double notaMat;
    public double notaFis;
    public double notaGeo;
    public double notaQuim;

    public Aluno(String nome, int matricula, double notaPor, double notaMat, double notaFis, double notaGeo, double notaQuim) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaPor = notaPor;
        this.notaMat = notaMat;
        this.notaFis = notaFis;
        this.notaGeo = notaGeo;
        this.notaQuim = notaQuim;
    }

    public double calcularMedia(){

        return (this.notaFis+this.notaGeo+this.notaMat+this.notaPor+this.notaQuim)/5;
    }

    public void situacaoAluno(){
        double media = calcularMedia();
        boolean aprovado = media > 6;
        System.out.printf("%nO aluno foi %s em : %.1f", (aprovado ? "aprovado" : "reprovado"), media);
    }
}


