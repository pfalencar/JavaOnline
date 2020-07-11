package br.com.abc.javacore.B_introducaometodos.classes;

public class Calculadora {

    public static void somaDoisNumeros() {
        System.out.println(5+5);
    }
    public static void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }
    public static void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1*num2);
    }
    public static double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public static void imprimeDoisNumDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1/num2);
            return;
            //o return faz o código retornar para a classe que chamou o método
            //e não vai executar as próxs linhas desse método.
            //esse return funciona como um break
        }
        System.out.println("Não é possível dividir por zero!");
    }

    public static void alteraDoisNumeros (int a, int b) {
        a = 30;
        b = 40;
        System.out.println("Dentro do método");
        System.out.println("num1 = " + a);
        System.out.println("num2 = " + b);
    }

    public static void somaArray (int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    //com varArgs posso passar um array ou os números separados por vírgula, tanto faz.
    //REGRAS: só posso ter 1 VarArgs por assinatura de método Ex.: (int... numeros, String... nomes), já não funciona.
    //O VarArgs precisa ser o último parâmetro. Ex.: (int valor, int... numeros)
    //int... numeros  =  int[] numeros ou int numeros[]
    public static void somaVarArgs(String nome, double valor, int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma + valor);
        System.out.println("nome: " + nome);
    }
    //sobrecarga
    public static void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("Soooma: " + soma);
    }
}
