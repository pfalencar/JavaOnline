package br.com.abc.javacore.B_introducaometodos.test;

import br.com.abc.javacore.B_introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.setNome("Pati");
        e1.setIdade(-3);
        e1.setNotas(new double[]{5, 4, 1});

        System.out.println(e1.getNome());
        System.out.println(e1.getIdade());
        double[] notas = e1.getNotas();
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

//        e1.imprimirEstudante();
        e1.calcularMedia();
        System.out.println(e1.isAprovado());
    }
}
