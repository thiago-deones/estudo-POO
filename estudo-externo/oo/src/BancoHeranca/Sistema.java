package BancoHeranca;

public class Sistema {

    public void autentica(Gerente g) {
        int senha = 2222;
        boolean autenticou = g.autentica(senha);
        if (autenticou) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
