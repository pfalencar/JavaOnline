/*
Crie uma variável salário e imprima seu imposto.
salário < 1000 => 5%
salário >= 1000  && salario < 2000 => 10%
salário >= 2000  && salario < 4000 => 15%
salário > 5000 => 20%
 */
public class ExercicioControleDeFluxo {
    float salario = 1000f;
    float imposto;

    public static void main(String[] args) {
        ExercicioControleDeFluxo exercCF1 = new ExercicioControleDeFluxo();
        //exercCF1.exercicioIfElse();
        exercCF1.exercicioIf();
    }

    //O compilador vai executar todos os ifs
    public void exercicioIf() {
        if (salario <= 1000) {
            imposto = (float) (salario * 0.05);
            System.out.println("Entrou no primeiro if");

            /*
        } else if (salario < 800) {
            System.out.println("Entrou no else if");
        */

        }
        if (salario < 800) {
            System.out.println("Entrou no else if");

        }
        if (salario >= 1000 && salario < 2000) {
            //imposto = (float) (salario * 0.10);
            System.out.println("Entrou no segundo if");

        }
        if (salario >= 2000 && salario < 4000) {
            imposto = (float) (salario * 0.15);
            System.out.println("Entrou no terceiro if");

        }
        if (salario >= 4000) {
            imposto = (float) (salario * 0.20);
            System.out.println("Entrou no quarto if");
        }

        System.out.println(imposto);
    }

    //O compilador vai executar só a condição verdadeira e vai esquecer as outras.
    public void exercicioIfElse() {

        if (salario < 1000) {
            imposto = (float) (salario * 0.05);

        } else if (salario >= 1000 && salario < 2000) {
            imposto = (float) (salario * 0.10);

        } else if (salario >= 2000 && salario < 4000) {
            imposto = (float) (salario * 0.15);

        } else {
            imposto = (float) (salario * 0.20);
        }

        System.out.println("Salário - imposto = " + (salario - imposto));
    }
}
