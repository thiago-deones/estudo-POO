package praticando.exercicio8;

public class TesteAluno {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Pedro", 12, "12345");

        System.out.println("Nome: " + a1.getnome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matricula: " + a1.getMatricula());

        a1.setIdade(11);
        a1.setNome("Maria");
        a1.setMatricula("5463");

        System.out.println("______________________");
        System.out.println("Nome: " + a1.getnome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matricula: " + a1.getMatricula());
    }
}
