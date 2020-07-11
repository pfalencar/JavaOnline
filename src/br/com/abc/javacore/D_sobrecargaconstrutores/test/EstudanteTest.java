package br.com.abc.javacore.D_sobrecargaconstrutores.test;

import br.com.abc.javacore.D_sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("457-78", "Maria", new double[]{5,7,9}, "12-06-2020");
        est.print();
    }
}
