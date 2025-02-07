package BancoHeranca;

public class Administrador extends Funcionario {

    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autencica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return 50;
    }
}
