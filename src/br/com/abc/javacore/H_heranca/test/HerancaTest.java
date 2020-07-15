package br.com.abc.javacore.H_heranca.test;

import br.com.abc.javacore.H_heranca.classes.Endereco;
import br.com.abc.javacore.H_heranca.classes.Funcionario;
import br.com.abc.javacore.H_heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa("Maria Helena");
//
//        //p.nome = ""; //não funciona!
//        // não funciona, pq estou em pacote diferente e pq esta classe não é filha de Pessoa
//        //portanto, a visibilidade protected está protegendo os atributos da classe Pessoa.
//
//        p.setCpf("254.457.879-00");
//        Endereco e = new Endereco("Rua 25 de março", "Centro");
//        p.setEndereco(e);
//        p.print();
//        System.out.println("===================================");

        Funcionario f2 = new Funcionario("José");
        Endereco e2 = new Endereco();
        f2.setCpf("784.457.879-00");
        f2.setSalario(2500);
        e2.setRua("Rua do Gasômetro");
        e2.setBairro("Brás");
        f2.setEndereco(e2);
        //f2.print();
        System.out.println("===================================");

//        Funcionario f3 = new Funcionario("Mary", "114.457.879-00", new Endereco("R. Brook Taylor", "Cerqueira César"), 10500);
//        f3.print();

    }
}
