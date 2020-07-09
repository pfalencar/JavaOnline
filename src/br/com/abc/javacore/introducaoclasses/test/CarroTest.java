package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        br.com.abc.javacore.introducaoclasses.classes.Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "JSI4578";
        carro.velocidadeMaxima = 100f;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);

    }
}
