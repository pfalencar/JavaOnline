package br.com.abc.javacore.A_introducaoclasses.test;

import br.com.abc.javacore.A_introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        br.com.abc.javacore.A_introducaoclasses.classes.Professor professor = new Professor();
        professor.nome = "João";
        professor.matricula = "65478-8";
        professor.cpf = "265.456.489-78";
        professor.rg = "34.791.789-4";

        Professor prof2 = new Professor();
        prof2.nome = "Maria";
        prof2.matricula = "789478-8";
        prof2.cpf = "165.456.489-78";
        prof2.rg = "54.791.789-4";

        professor = prof2;

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);
        System.out.println("--------------------------");
        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.cpf);
        System.out.println(prof2.rg);
    }


}
