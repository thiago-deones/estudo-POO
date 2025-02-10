package BancoHeranca;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha){

        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {
        System.out.println("bonificação gerente");
        return super.getSalario();
    }
}
