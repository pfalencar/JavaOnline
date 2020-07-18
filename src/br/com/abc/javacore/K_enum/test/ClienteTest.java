package br.com.abc.javacore.K_enum.test;

import br.com.abc.javacore.K_enum.classes.Cliente;
import br.com.abc.javacore.K_enum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        //Uma enum chama-se igual um atributo estático: chama pela classe não pela instância.
        Cliente c = new Cliente("Ana", TipoCliente.PESSOA_JURIDICA);
        //se no argumento "int tipo" eu colocasse 10 e isso fosse para o banco, seria um gde problema.
        //para isso criou-se a enum.
        System.out.println(c);
    }
}
