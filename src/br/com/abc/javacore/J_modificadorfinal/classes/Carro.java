package br.com.abc.javacore.J_modificadorfinal.classes;

public class Carro {
    //static -> independente do objeto o atributo vai permanecer o mesmo para todos eles, pq o atributo é da classe.
    public static final double VELOCIDADE_LIMITE = 250;

    public final Comprador comprador = new Comprador();

    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Comprador getComprador() {
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
