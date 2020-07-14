package br.com.abc.javacore.G_associacao.test;

import br.com.abc.javacore.G_associacao.classes.Aluno;
import br.com.abc.javacore.G_associacao.classes.Local;
import br.com.abc.javacore.G_associacao.classes.Professor;
import br.com.abc.javacore.G_associacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Patricia",35);
        Aluno aluno2 = new Aluno("Joana D'arc",54);
        Aluno aluno3 = new Aluno("Manuela",34);
        Aluno aluno4 = new Aluno("Olga",22);

        Seminario sem = new Seminario("Como ser um baita programador");
        Seminario sem2 = new Seminario("Treinamento para vencer");
        Seminario sem3 = new Seminario("Java e UML na prática");

        Professor prof = new Professor("Yoda", "Usar a força para programar");
        Professor prof2 = new Professor("Fernandes", "Javeira");


        Local local = new Local("Rua das Araras", "Bairro do Mato");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        Aluno[] alunos = new Aluno[]{aluno, aluno2};

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(alunos);
        prof.setSeminarios(new Seminario[]{sem});

//        prof.print();
//        local.print();
//        aluno.print();
//        aluno2.print();
//        sem.print();

//        aluno3.setSeminario(sem2);
        aluno4.setSeminario(sem3);
//        sem2.setProfessor(prof2);
        sem3.setProfessor(prof2);
//        sem2.setLocal(local);
        sem3.setLocal(local);
//        sem3.setAlunos(new Aluno[]{aluno3, aluno4});
        prof2.setSeminarios(new Seminario[]{sem2,sem3});

//        prof2.print();
//        aluno3.print();
        sem2.print();

//        aluno4.print();
//        sem3.print();
    }
}
