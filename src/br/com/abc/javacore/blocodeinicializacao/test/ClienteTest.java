package br.com.abc.javacore.blocodeinicializacao.test;

import br.com.abc.javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        System.out.println("Exibindo qtde de parcelas possíveis");
        for (int parcela: cli.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
