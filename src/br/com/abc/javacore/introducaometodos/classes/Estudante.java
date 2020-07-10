package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    //métodos de acesso para proteger o nosso código = > encapsulamento
    public boolean isAprovado() {
        return this.aprovado;
    }
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Tentativa de inserir idade < 0!");
            return;
        }
        this.idade = idade;
    }
    public void setNotas(double... notas) {
        this.notas = notas;
    }

    public void imprimirEstudante() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas!");
            return;
        }
        for (double nota : this.notas) {
            System.out.println("Nota: " + nota);
        }
    }

    public void calcularMedia() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas!");
            return;
        }
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        if (media > 6) {
            aprovado = true;
            System.out.printf("APROVADO! Média: %.2f %n", media);
        } else {
            aprovado = false;
            System.out.printf("REPROVADO! Média: %.2f %n", media);
        }
    }
}
