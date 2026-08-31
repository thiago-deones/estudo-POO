package javacore.Dintroducao.introducaoclasses.teste;

import javacore.Dintroducao.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade=18;
        estudante.sexo='M';
        estudante.nome="Luffy";

        System.out.println(estudante.nome);
    }
}
