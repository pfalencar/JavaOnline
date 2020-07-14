package br.com.abc.javacore.G_associacao.classes;
//Só qdo a variável é um Array, preciso fazer essa verificação: (this.alunos.length != 0)
//porque eu posso ter o array instanciado, mas ele pode não estar populado, assim o tamanho do array será zero.
public class Seminario {
    private String titulo;
    private Local local;
    private Professor professor;
    private Aluno[] alunos;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("---------------------------Relatório de Seminários:---------------------------");
        System.out.println("Título: " + this.titulo);
        if (this.professor != null) {
            System.out.println("Professor palestrante: " + this.professor.getNome());
        } else {
            System.out.println("Não há professor cadastrado para ministrar este seminário.");
        }

        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + ", Bairro: " + this.local.getBairro());
        } else {
            System.out.println("Não há local cadastrado para este seminário.");
        }
        System.out.println("Alunos inscritos:");
        if (this.alunos != null && this.alunos.length != 0) {
            for (Aluno aux : alunos) {
                System.out.println(aux.getNome());
            }
        } else {
            System.out.println("Não há alunos inscritos nesse seminário.");
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
