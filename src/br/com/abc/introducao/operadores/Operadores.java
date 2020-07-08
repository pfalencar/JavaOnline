package br.com.abc.introducao.operadores;

public class Operadores {
    public static void main (String [] args) {
       Operadores operadores = new Operadores();
       //operadores.concatenarESomar();
       operadores.operacaoComMod();
    }

    public void concatenarESomar () {
        float numero1 = 10;
        float numero2 = 20;
        System.out.println( numero1 + numero2 + ". A soma é " + numero1 + numero2);
        System.out.println("\n");
        System.out.println("A soma é " + (numero1 + numero2));
        System.out.println("\n");
        System.out.println("A soma é " + (numero1 / numero2));
    }

    public void operacaoComMod () {
        int numeroInteiro = 20;
        long numeroLong = 200000L;

        double numeroDouble = 10d;
        float numeroFloat = 20f;
        numeroFloat = (float) numeroDouble;
        int resto = 20%2;
        System.out.println("Resto da divisão "
                + resto);
        System.out.print(numeroDouble);
    }
}
