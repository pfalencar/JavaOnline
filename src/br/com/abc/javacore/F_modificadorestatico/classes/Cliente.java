package br.com.abc.javacore.F_modificadorestatico.classes;
//REGRA DE INICIALIZAÇÃO DO JAVA:
//0-Bloco de Inicialização NÃO ESTÁTICO é executado qdo a JVM carregar a classe (é executado apenas 1 vez)
//1-É alocado espaço na memória para o objeto que será criado (o Cliente)
//2-Cada atributo de classe é criado e inicializado com seus valores default ou explícitos
//3-Bloco de inicialização é executado
//4-O construtor é executado

//Boas práticas: colocar o bloco de inicialização antes do construtor, pq ele é executado antes do construtor,
//não importa se ele estiver lá embaixo dentro da classe, ele vai ser executado antes do construtor.
//Veja que os valores da variável parcelas já estão preenchidos, mesmo antes da execução do construtor.
//Se eu não inicializar a variável com new int[100], o código não vai funcionar.

public class Cliente {
    private static int[] parcelas;

    //O bloco de inicialização NÃO estático, pode acessar atributos não estáticos.
    //Porque o atributo estático vai existir antes mesmo de ter o bloco de inicialização.
    //Bloco de Inicialização NÃO ESTÁTICO será executado toda vez que um objeto for instanciado.
    //Bloco de Inicialização ESTÁTICO -> Executado uma única vez, independentemente de qtos objetos forem instanciados.
    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático");
        Cliente.parcelas = new int[100];
        for ( int i = 1; i <= 100; i++ ) { Cliente.parcelas[i-1] = i; }
    }

    static {
        System.out.println("estático 2");
    }

    static {
        System.out.println("estático 3");
    }


    public Cliente() { }

    public static int[] getParcelas() {
        return Cliente.parcelas;
    }
}