package br.com.abc.introducao.arrays;

public class Arrays6 {
    public static void main(String[] args) {
        //formas de inicializar um array:
        int[] arrInt = {1,2,3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[] {1,2,3};

//        int[][] dias = new int[3][];
//        dias[0] = new int[2];
//        dias[1] = new int[]{1,2,3};
//        dias[2] = new int[4];

        //array multidimensional: 3 posições
        int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};
//Qual é o valor da posição [1][2] = 3

        for (int i = 0; i < dias.length; i++) {

        }
        for(int[] ref: dias) {
            for (int num: ref) {
                System.out.println(num);
            }
        }
    }
}
