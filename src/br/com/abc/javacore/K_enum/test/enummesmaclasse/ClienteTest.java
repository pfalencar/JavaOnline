package br.com.abc.javacore.K_enum.test.enummesmaclasse;

import br.com.abc.javacore.K_enum.classes.enummesmaclasse.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        //Uma enum chama-se igual um atributo estático: chama pela classe não pela instância.
        //Neste caso o "TipoPagamento" é como se fosse uma classe estática interna de Cliente.
        Cliente c = new Cliente("Ana", Cliente.TipoPagamento.APRAZO);
        System.out.println(c);
    }
}
