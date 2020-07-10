package br.com.abc.javacore.sobrecargametodos.classes;
//SOBRECARGA DE MÉTODOS: É qdo o método tem o mesmo nome, mas o tipo ou a qtde dos parâmetros é diferente.
//modificador de acesso e retorno podem ser diferentes tb.
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    //Sobrecarga pode ser utilizada tb nos construtores
    public Funcionario(String nome, String cpf, double salario, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }
    public Funcionario() {
    }

    public void init(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public void init(String nome, String cpf, double salario, String rg) {
        this.init(nome, cpf, salario);
        this.rg = rg;
    }

    public void print(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return this.rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
}
