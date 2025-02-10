package BancoHeranca;

public class Gerente extends Funcionario implements Autenticavel {

    private AutentucacaoUtil autenticador;

    public double getBonificacao() {
        System.out.println("bonificação gerente");
        return super.getSalario();
    }

    public Gerente() {
        this.autenticador = new AutentucacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
}
