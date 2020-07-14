package br.com.abc.javacore.H_heranca.classes;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario() {
    }

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    //sobreescrita do método print() da classe Pessoa
    //Uma sobreecrita de método deve ter a mesma assinatura do método: Mesmo nome e igual qtde de parâmetros.
    //Na execução este método tem precedência na classe funcionário do que o print() de Pessoa.
    public void print() {
        super.print();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
