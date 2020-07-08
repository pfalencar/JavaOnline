package br.com.abc.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        //sempre temos que inicializar o array
        int[] numeros1 = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
        String[] nomes = {"Maria", "Patricia", "João"};

        int i = 0;
        for (; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

//        for (int aux: numeros2){
//            System.out.println(aux);
//        }

//        for (String aux: nomes){
//            System.out.println(aux);
//        }

    }
}
