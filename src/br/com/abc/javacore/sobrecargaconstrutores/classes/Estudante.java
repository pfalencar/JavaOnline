package br.com.abc.javacore.sobrecargaconstrutores.classes;
//REGRAS PARA CHAMADA DE CONSTRUTOR:
//1-Só funciona se for chamado na primeira linha de código dentro do construtor.
//2-Só podemos chamar ou sobrecarregar construtores dentro de outros construtores

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        //this(); //chama o construtor que não recebe parâmetro
        this(matricula, nome, notas); // chama o construtor que recebe esses 3 parâmetros
        this.dataMatricula = dataMatricula;
    }

    public Estudante() {
        System.out.println("Dentro do construtor default!");
    }

    public void print() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for (double nota: this.notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        System.out.println(this.dataMatricula);
    }

    public String getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
