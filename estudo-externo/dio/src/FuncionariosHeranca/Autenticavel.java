package FuncionariosHeranca;

//contrato Autenticavel
//quem assina esse contrato, precisa implementar
//metodo setSenha
//metodo autentica

public interface Autenticavel {

    public abstract void setSenha(int senha) ;

    public abstract boolean autentica(int senha) ;
}
