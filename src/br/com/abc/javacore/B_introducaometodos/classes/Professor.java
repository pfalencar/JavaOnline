package br.com.abc.javacore.B_introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;
    //Ctrl + d  copia a linha igualzinha que está em cima

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.rg);
        System.out.println(this.matricula);
    }
}
