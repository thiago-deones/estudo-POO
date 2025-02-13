package FuncionariosHeranca;

public class Principal {
    public static void main(String[] args) {

        Funcionario nico = new Gerente();
        nico.setNome("Thiago");
        nico.setCpf("123434");
        nico.setSalario(1000);

        System.out.println(nico.getNome());

        Gerente g1 = new Gerente();
        g1.setNome("Pedro");
        g1.setSalario(5000);
        g1.autentica(2222);

        System.out.println();
        System.out.println();
        System.out.println();
    }
}
