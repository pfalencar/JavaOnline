package br.com.abc.javacore.A_introducaoclasses.test;

import br.com.abc.javacore.A_introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "João";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.idade);
        System.out.println(joao.matricula);
    }
}
