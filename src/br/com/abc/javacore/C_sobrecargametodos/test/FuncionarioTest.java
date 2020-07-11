package br.com.abc.javacore.C_sobrecargametodos.test;

import br.com.abc.javacore.C_sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva","125.154.457-01", 4500.45,"47.458.624-7");
        Funcionario funcionario2 = new Funcionario();

        funcionario.print();
        funcionario2.print();
    }
}
