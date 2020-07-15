package br.com.abc.javacore.H_heranca.classes;
/*ORDEM DE EXECUÇÃO NA SUBCLASSE:
0-Bloco de inicialização ESTÁTICO de Pessoa
1-Bloco de inicialização ESTÁTICO de Funcionário
2-Blocos de inicialização não-estáticos da Classe Pessoa (na ordem em que aparecem na classe Pessoa)
3-Construtor da Classe Pessoa (o Java escolhe aquele com a qtde e tipo do parâmetro enviado pela main)
4-Blocos de inicialização não-estáticos da Classe Funcionário (na ordem em que aparecem na classe Pessoa)
5-Construtor da Classe Funcionário (o Java escolhe aquele com a qtde e tipo do parâmetro enviado pela main)
 */
public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor da classe Funcionário");
    }

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
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
