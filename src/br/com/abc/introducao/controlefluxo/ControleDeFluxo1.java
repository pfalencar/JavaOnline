package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo1 {

    public static void main(String[] args) {
        ControleDeFluxo1 cf1 = new ControleDeFluxo1();
        //cf1.seEntao();
        //cf1.booleanComparacaoAtribuicao();
        cf1.torneioTenis();
    }

    public void seEntao () {
        int idade = 124;
        if (idade >= 18) {
            System.out.println("Pode entrar no clube");
        } else {
            System.out.println("Não pode entrar no clube");
        }
    }

    public void booleanComparacaoAtribuicao () {
        boolean c = false;
        if (c == true) System.out.println("Entrou no clube");
        if (c = true) System.out.println("entrou no clube");
    }

    public void torneioTenis (){
        //idade < 15 => categoria infantil
        //idade >=15 e idade < 18 => categoria juvenil
        //idade >= 18 adulto
        int idade = 18;
        String categoria = "inicializada";
        if (idade < 15) {
            categoria = "categoria infantil";
        } else if (idade >=15 && idade < 18) {
            categoria = "categoria juvenil";
        }
        System.out.println(categoria);
    }
}
