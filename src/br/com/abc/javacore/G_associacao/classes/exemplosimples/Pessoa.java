package br.com.abc.javacore.G_associacao.classes.exemplosimples;

//relacionamento Pessoa(0..*)-------- tem um -> --------(1,1)Departamento
public class Pessoa {
    private Departamento departamento;
    private Endereco endereco;
}
