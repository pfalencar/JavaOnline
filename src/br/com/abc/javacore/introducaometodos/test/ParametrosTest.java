package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc2 = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc2.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro do teste");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
