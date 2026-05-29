package FuncionariosHeranca;

public class Cliente implements Autenticavel {

    private int senha;
    private AutentucacaoUtil autenticador;
    public  Cliente() {
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
