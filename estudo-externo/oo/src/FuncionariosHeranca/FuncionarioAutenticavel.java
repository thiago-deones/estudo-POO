package FuncionariosHeranca;

public abstract class FuncionarioAutenticavel extends Funcionario{

    private int senha;

    public FuncionarioAutenticavel(String nome, String cpf, double salario) {
    }

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
}
