package br.com.abc.javacore.F_modificadorestatico.test;

import br.com.abc.javacore.F_modificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        System.out.println("Exibindo qtde de parcelas possíveis");
//        for (int parcela: Cliente.getParcelas()){
//            System.out.print(parcela + " ");
//        }
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
    }
}
