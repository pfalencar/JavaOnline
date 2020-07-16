package br.com.abc.javacore.J_modificadorfinal.test;

import br.com.abc.javacore.J_modificadorfinal.classes.Carro;
import br.com.abc.javacore.J_modificadorfinal.classes.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro car = new Carro();
//        VELOCIDADE_LIMITE é um constante (final). E uma constante em Java, vc não pode alterar o valor
//         da variável uma vez que ela já foi inicializada. Isso para variáveis de tipo primitivo.
//        Carro.VELOCIDADE_LIMITE = 280;
//        System.out.println(c);

        System.out.println(car.getCOMPRADOR());
        car.getCOMPRADOR().setNome("Manuela");
        System.out.println(car.getCOMPRADOR());
//        car.comprador = new Comprador();

    }
}
