package br.com.abc.javacore.G_associacao.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void print() {
        System.out.println("---------------------------Relatório de Alunos:---------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminário inscrito: " + this.seminario.getTitulo());//significa que tem um objeto Aluno relacionado a este seminário
            return;
        }
        System.out.println("Seminário inscrito: Aluno não está inscrito em nenhum seminário.");//Não há seminário relacionado a este aluno
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
