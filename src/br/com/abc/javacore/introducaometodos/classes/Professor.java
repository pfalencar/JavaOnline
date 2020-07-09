package br.com.abc.javacore.introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;
    //Ctrl + d  copia a linha igualzinha que está em cima

    public void imprime(Professor aux) {
        System.out.println(aux.cpf);
        System.out.println(aux.nome);
        System.out.println(aux.matricula);
        System.out.println(aux.rg);
        aux.nome = "Nome alterado no imprime";
        System.out.println(aux.nome);
    }
}
