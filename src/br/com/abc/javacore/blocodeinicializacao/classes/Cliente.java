package br.com.abc.javacore.blocodeinicializacao.classes;
//REGRA DE INICIALIZAÇÃO DO JAVA:
//1-É alocado espaço na memória para o objeto que será criado (o Cliente)
//2-Cada atributo de classe é criado e inicializado com seus valores default ou explícitos
//3-Bloco de inicialização é executado
//4-O construtor é executado
public class Cliente {
    private int[] parcelas;

    //Boas práticas: colocar o bloco de inicialização antes do construtor, pq ele é executado antes do construtor,
    //não importa se ele estiver lá embaixo dentro da classe, ele vai ser executado antes do construtor.
    //veja que os valores da variável parcelas já estão preenchidos. Mesmo antes da execução do construtor.
    //se eu não inicializar a variável com new int[100] o código não vai funcionar.
    {
        System.out.println("Dentro do bloco de inicialização");
        parcelas = new int[100];
        for ( int i = 1; i <= 100; i++ ) {
            parcelas[i-1] = i;
        }
    }

    public Cliente() {
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}