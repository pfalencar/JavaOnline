package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicao {
    // =, -=, +=, *=, /=, %=
    int salario = 1800;

    public static void main(String[] args) {
        OperadoresDeAtribuicao oda1 = new OperadoresDeAtribuicao();
        oda1.modIgual();
    }

    public void maisMenosIgual () {
        //salario = salario + 1000;
        salario += 1000;

        //salario = salario - 1000;
        salario -= 1000;
        System.out.println(salario);
    }

    public void vezesIgual () {
        //salario = salario + (int)(salario * 0.1);
        salario *= 1.1;
        System.out.println(salario);
    }

    public void modIgual () {
        int numero = 11;
        //numero = numero % 2;
        numero %= 2;
        System.out.println(numero);
    }
}
