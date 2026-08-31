package javacore.Dintroducao.introducaometodos.test;

import javacore.Dintroducao.introducaometodos.dominio.Estudante;
import javacore.Dintroducao.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante imprimir = new ImpressoraEstudante();

        estudante1.idade = 15;
        estudante1.sexo = 'M';
        estudante1.nome = "Midoriay";

        estudante2.idade = 16;
        estudante2.sexo = 'F';
        estudante2.nome = "May";

        imprimir.imprimir(estudante1);
        System.out.println("-----------------");
        imprimir.imprimir(estudante2);

    }

}
