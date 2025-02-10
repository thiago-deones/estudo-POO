package BancoHeranca;

import Banco.Cliente;

public class TesteSistema {
    public static void main(String[] args) {

        Gerente g = new Gerente("pedro","123", 9000);
        g.autentica(2222);


        Administrador a = new Administrador("paulo", "12354", 1000);
        a.setSenha(3333);

        Cliente c = new Cliente();
        c.setSenha(2222);

        Sistema si = new Sistema();
        si.autentica(g);


    }
}
