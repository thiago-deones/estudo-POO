package FuncionariosHeranca;

public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Pedro");
        g1.setSalario(10000);
        EditorVideo e1 = new EditorVideo("Gabi", "981298739", 2500);


        Designer d = new Designer("Ana", "8945", 1000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(e1);
        controle.registra(d);

        System.out.println(controle.getSoma());
        System.out.println(controle.getSoma());
        controle.registra(e1);
        System.out.println(controle.getSoma());


    }
}
