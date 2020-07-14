package br.com.abc.javacore.G_associacao.classes;
//Cuidado com NullPointerException - erro em tempo de execução.
//Qdo vc chama um método de uma variável que não foi populada, ou seja, que está nula.
public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("---------------------------Relatório de Professor:---------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios != null && seminarios.length != 0) {
            System.out.println("Seminários participantes: ");
            for (Seminario aux : seminarios) {
                System.out.println("Seminários ministrados: " + aux.getTitulo());
            }
            return;
        }
        System.out.println("Não há um array de seminários para este professor");
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
