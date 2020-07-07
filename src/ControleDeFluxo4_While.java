public class ControleDeFluxo4_While {
    public static void main(String[] args) {
        int contador = 11;
        //while e do while vc utiliza qdo não sabe qtas vezes vai ter que repetir um pedaço de código
        while (contador < 10) {
            System.out.println(++contador);
        }
        contador = 0;
        //executa pelo menos 1 vez antes da condição
        do {
            System.out.println("dentro do while: " + contador++);
        } while (contador < 10);

        //FOR vc usa qdo já sabe qtas vezes tem que repetir o pedaço de código
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i é: " + i);
            if (i == 5) break;
        }
    }
}
