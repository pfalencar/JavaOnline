package br.com.abc.javacore.B_introducaometodos.test;

import br.com.abc.javacore.B_introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.nome = "Marcos";
        prof1.cpf = "457.158.487-44";
        prof1.rg = "45.487.981-7";
        prof1.matricula = "4578-78";
        prof1.imprime();

        System.out.println("----------------------------------");

        Professor prof2 = new Professor();
        prof2.nome = "Joana";
        prof2.cpf = "154.158.487-44";
        prof2.rg = "35.487.981-7";
        prof2.matricula = "7878-78";
        //não importa se chamo pelo prof1 ou prof2,
        //pq os 2 fazem referencia ao tipo Professor
        //o tipo é o q importa, pq quero acessar o que tem dentro desse tipo,
        //prof1.imprime(prof2);
        prof2.imprime();
        System.out.println("----------------------------------");


    }
}
