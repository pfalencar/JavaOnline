package br.com.abc.javacore.I_sobreescrita.test;

import br.com.abc.javacore.I_sobreescrita.classes.Pessoa;

public class PessoaTest{
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina");
        p.setIdade(300);
        System.out.println(p);

        Pessoa p2 = new Pessoa();
        p2.setNome("João");
        p2.setIdade(100);
        System.out.println(p2.toString());
    }
}
