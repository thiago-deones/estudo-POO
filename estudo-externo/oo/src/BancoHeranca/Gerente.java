package BancoHeranca;

public class Gerente extends Funcionario {

    private int senha;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    //    public double getBonificacao() {
//
//        return this.salario * 0.1;
//    }


}
