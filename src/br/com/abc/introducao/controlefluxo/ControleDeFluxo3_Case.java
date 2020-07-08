package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo3_Case {
    public static void main(String[] args) {
        byte dia = 5;
        //só que pode colocar dentro do switch para comparar:
        //char, int, byte, short, enum e String
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");

                if (true) {
                    System.out.println("true");
                }
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
        }
        char sexo = 'M';
        switch (sexo) {
            default:
                System.out.println("indefinido");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;

        }
    }
}
