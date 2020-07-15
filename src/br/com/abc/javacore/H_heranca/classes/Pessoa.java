package br.com.abc.javacore.H_heranca.classes;
//protected permite às classes filhas acessarem os atributos da classe mãe, como se fossem delas.

/*ORDEM DE EXECUÇÃO NA SUPERCLASSE:
1-Bloco de inicialização ESTÁTICO de Pessoa (que é a superclasse de Funcionário)
2-Blocos de inicialização não-estáticos na ordem em que aparecem na classe Pessoa
3-Construtor da Classe (o Java escolhe aquele com a qtde e tipo do parâmetro enviado pela main)
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Dentro do construtor de Pessoa");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 100");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2");
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (this.endereco != null) {
            System.out.println("End: " + this.getEndereco().getRua() + ", " + this.getEndereco().getBairro());
            return;
        }
        System.out.println("Não há endereço vinculado a esta pessoa.");
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
