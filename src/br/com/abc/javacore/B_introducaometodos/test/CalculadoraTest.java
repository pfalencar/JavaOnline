package br.com.abc.javacore.B_introducaometodos.test;

import br.com.abc.javacore.B_introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String... args) {
        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumeros();
        Calculadora.multiplicaDoisNumeros(3,5);

        double result = Calculadora.divideDoisNumeros(20, 0);
        System.out.println((int)result);

        System.out.println("Dividindo 2 números:");
        Calculadora.imprimeDoisNumDivididos(30,2);
        System.out.println("Continuando a excecução...");
        int[] vetor = {2,4,6,10};
        Calculadora.somaArray(vetor);

        Calculadora.somaVarArgs(1,2,3,4,5,6);
        Calculadora.somaVarArgs("Pati", 340.5, vetor);
    }
}
