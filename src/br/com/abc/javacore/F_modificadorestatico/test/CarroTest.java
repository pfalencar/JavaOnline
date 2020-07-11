package br.com.abc.javacore.F_modificadorestatico.test;

import br.com.abc.javacore.F_modificadorestatico.classes.Carro;
//A criação do objeto não influencia nos valores estáticos dos atributos,
//pq ele é independente de objeto, ele é vinculado à classe.

public class CarroTest {
    private static String teste;

    public static void main(String[] args) {

        System.out.println(teste);//só posso acessar essa variável dentro do método estático, pq ela é estática!
        Carro.setVelocidadeLimite(200);

        System.out.println(Carro.getVelocidadeLimite());

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);

        System.out.println("#######################");

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();


    }
}
