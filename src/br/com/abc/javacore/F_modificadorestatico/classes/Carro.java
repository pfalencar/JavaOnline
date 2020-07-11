package br.com.abc.javacore.F_modificadorestatico.classes;

//STATIC pertence a Classe Carro, não mais a um objeto.
//Qdo eu altero um atributo static, altero seu valor em todos os objetos dessa classe
//velocidadeLimite = 240km/h
//Por mais que aqui a velocidadeLimite = 240, esse é o valor qdo se cria o objeto,
// mas o valor estático está acima de cada objeto, pq é um valor da classe.
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    {
        imprimir();
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    //caso vc esteja acessando atributos declarados nesta classe, o método não pode ser estático.
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        //THIS faz parte do objeto e não da classe, portanto, no atributo estático, não se coloca o THIS
        System.out.println("Velocidade Limite: " + velocidadeLimite);
        System.out.println("---------------------------------");
    }

    //se vc não está acessando atributos declarados nesta classe, se só está recebendo algum tipo de parâmetro:
    //o método pode ser transformado em estático
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
