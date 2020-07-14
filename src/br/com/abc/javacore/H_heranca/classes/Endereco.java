package br.com.abc.javacore.H_heranca.classes;

public class Endereco {
    private String rua;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public void print(){
        System.out.println("Rua: " + this.rua);
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Laís";
        pessoa.cpf = "1234";
        pessoa.endereco = new Endereco("Rua Amazonas", "Bairro do Lmão");

        pessoa.print();
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
