package br.com.abc.javacore.K_enum.test.exemplo;

import br.com.abc.javacore.K_enum.classes.exemplo.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Ana", Cliente.PESSOA_FISICA);
        //se no argumento "int tipo" eu colocasse 10 e isso fosse para o banco, seria um gde problema.
        //para isso criou-se a enum.
        System.out.println(c);
    }
}
