package exercicio8;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro",12,"12345");

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Nome: " + a1.getMatricula());


        a1.setNome("Maria");
        a1.setIdade(11);
        a1.setMatricula("12346");


        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Nome: " + a1.getMatricula());
        
    }
}
