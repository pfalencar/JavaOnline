package br.com.abc.javacore.J_modificadorfinal.classes;

//FINAL NA CLASSE: Ela não pode ser estendida. É uma classe perfeita, portanto, não deve ser mudada.
//Exemplo: a classe String
public class Carro {

    //static -> independente do objeto o atributo vai permanecer o mesmo para todos eles, pq o atributo é da classe.

    //FINAL NOS ATRIBUTOS: sempre precisam ser inicializados e não podem ser modificados.
    //O nome da variável final deve ser sempre em maiúsculas.
    public static final double VELOCIDADE_LIMITE = 250;

    //FINAL NO ATRIBUTO DE REFERÊNCIA: o mesmo atributo não pode referenciar outro objeto. (new Comprador)
    //Mas os atributos da variável criada e inicializada podem ser alterados. (String nome, etc)
    public final Comprador COMPRADOR = new Comprador();

    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //FINAL NO MÉTODO: não pode ser sobreescrito, pq é um método perfeito.
    //Só é possível fazer sobrecarga do método. Vide classe Subaru.
    public final void imprime(){ }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
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
