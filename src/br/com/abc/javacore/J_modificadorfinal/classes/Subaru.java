package br.com.abc.javacore.J_modificadorfinal.classes;

public class Subaru extends Carro{
    //se for igualzinho ao método da classe Carro, será uma sobreescrita, então, não é permitido. Dá erro.
    //public void imprime() { }

    //Sobrecarga do método é permitido.
    public void imprime(String nome) {}
}
