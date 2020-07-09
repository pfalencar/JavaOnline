package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(3,5);

        double result = calc.divideDoisNumeros(20, 0);
        System.out.println((int)result);

        System.out.println("Dividindo 2 números:");
        calc.imprimeDoisNumDivididos(30,2);
        System.out.println("Continuando a excecução...");
    }
}
