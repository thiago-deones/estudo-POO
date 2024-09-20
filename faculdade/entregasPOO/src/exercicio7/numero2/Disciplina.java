package exercicio7.numero2;

public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;

    public Disciplina(String nomeDisciplina, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
