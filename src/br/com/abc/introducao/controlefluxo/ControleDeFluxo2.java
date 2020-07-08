package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo2 {
    int idade = 15;
    String status;

    public static void main(String[] args) {
        ControleDeFluxo2 cdf2 = new ControleDeFluxo2();
        //cdf2.operadorTernario();
        cdf2.operadorTernarioComplexo();
    }

    public void operadorTernarioComplexo () {
        //idade < 15 => categoria infantil
        //idade >=15 e idade < 18 => categoria juvenil
        //idade >= 18 adulto
        status = idade < 15 ? "categoria infantil" : idade >=15 && idade < 18 ? "categoria juvenil" : "adulto";
        System.out.println(status);
    }

    public void operadorTernario () {
        /*
        if (idade < 18) {
            status = "Não adulto";
        } else {
            status = "Adulto";
        }
        */
        status = idade < 18 ? "Não adulto" : "Adulto";
        System.out.println(status);
    }


}
