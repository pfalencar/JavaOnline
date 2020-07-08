package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        //char '\u0000' (unicode que representa o vazio) ' '
        //boolean false
        //reference (arrays de objetos) null
        String [] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("nomes: " + i + ": " + nomes[i]);
        }

        String[] temporaria = new String[nomes.length];
        for(int j = 0; j < nomes.length; j++) {
            temporaria[j] = nomes[j];
            System.out.println("Temporaria " + j + ": " + temporaria[j]);
        }

        nomes = new String[4];

        for (int i = 0 ; i < temporaria.length; i++) {
            nomes[i] = temporaria[i];
            System.out.println(nomes[i]);
        }

        for (int i = 0 ; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
