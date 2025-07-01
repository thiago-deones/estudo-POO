package FuncionariosHeranca;

public class Sistema {
    private int senha = 2222;

    public void autentica(Gerente g) {

        boolean autenticou = g.autentica(this.senha);

        if (autenticou) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
