package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.cpf = "457.158.487-44";
        prof1.matricula = "4578-78";
        prof1.nome = "Marcos";
        prof1.rg = "45.487.981-7";
        prof1.imprime(prof1);

        System.out.println("----------------------------------");

        Professor prof2 = new Professor();
        prof2.cpf = "154.158.487-44";
        prof2.matricula = "7878-78";
        prof2.nome = "Joana";
        prof2.rg = "35.487.981-7";
        //não importa se chamo pelo prof1 ou prof2,
        //pq os 2 fazem referencia ao tipo Professor
        //o tipo é o q importa, pq quero acessar o que tem dentro desse tipo,
        prof1.imprime(prof2);

        System.out.println("----------------------------------");

        System.out.println("Dentro do professor test");
        System.out.println(prof1.nome);
        prof2.imprime(prof2);
        System.out.println("----------------------------------");
        System.out.println(prof2.nome);

    }
}
