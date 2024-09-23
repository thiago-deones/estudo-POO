package praticando.exercicio7;

public class Disciplina {
    public String nome;
    public int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirDiciplina(){
        System.out.println("A disciplina é " + nome);
        System.out.println("A sua carga horaria é de  " + cargaHoraria + " horas.");
    }
}
