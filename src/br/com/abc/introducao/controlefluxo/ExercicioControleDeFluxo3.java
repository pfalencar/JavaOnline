package br.com.abc.introducao.controlefluxo;

public class ExercicioControleDeFluxo3 {
    public static void main(String[] args) {
        //imprimirPares();
        imprimirImpares();
    }
    //Imprima todos os números pares de 0 a 100.000
    public static void imprimirPares () {
        int valor = 100000;
        for (int i = 0; i <= valor; i = i+2) {
            System.out.println("Valor: " + i);
        }
    }
    //Imprima todos os números ímpares de 0 a 100.000
    public static void imprimirImpares () {
        int valor = 100000;
        for (int i = 1; i <= valor; i = i+2) {
            System.out.println("Valor: " + i);
        }
    }
}
