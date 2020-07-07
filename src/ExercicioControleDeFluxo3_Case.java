//Dado um valor de 1 a 7, considerando 1 domingo, imprima se é dia útil ou fds. Use switch.
public class ExercicioControleDeFluxo3_Case {
    public static void main(String[] args) {
        byte dia = 6;
        //char, int, byte, short, enum e String
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Digite um número de 1 a 7");
        }

    }
}
