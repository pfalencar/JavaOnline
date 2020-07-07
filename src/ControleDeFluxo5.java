//Dado o valor de um carro, descubra qtas vezes ele pode ser parcelado
//Porém as parcelas não podem ser menor ou igual do que 1000.
public class ControleDeFluxo5 {
    public static void main(String[] args) {
        //incrementarParcelas ();
        decrementarParcelas();
    }

    //Usando o "continue" faz com que o resto de código que está abaixo dele seja ignorado e vai para a próx iteração do FOR.
    public static void decrementarParcelas() {
        double valorTotalCarro = 10000;
        double valorParcela = 0;
        int numParcelas = 1;

        for (numParcelas = (int) valorTotalCarro; numParcelas >= 1; numParcelas--) {

            valorParcela = valorTotalCarro / numParcelas;

            if (valorParcela < 1000) {
                continue;
            }
            System.out.printf(numParcelas + " parcelas de R$ %.2f %n", valorParcela);
        }

    }


    //O "break" sai do FOR e não itera mais nada.
    public static void incrementarParcelas() {
        double valorTotalCarro = 10000;
        double valorParcela = 0;
        int numParcelas = 1;

        for (numParcelas = 1; numParcelas < valorTotalCarro; numParcelas++) {

            valorParcela = valorTotalCarro / numParcelas;

            if (valorParcela < 1000) {
                System.out.println(numParcelas + " - Saindo do laço, pq não é >=1000 o valor da parcela!");
                break;
            }
            System.out.printf(numParcelas + " parcelas de R$ %.2f %n", valorParcela);

        }
    }

}
