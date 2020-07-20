package br.com.abc.javacore.K_enum.classes.enummesmaclasse;

public class Cliente {
    public enum TipoPagamento {
        AVISTA, APRAZO
    }
    private String nome;
    private TipoPagamento tipoPagamento;

    //construtor
    public Cliente(String nome, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente => nome: " + nome + ", tipo Pagamento: " + tipoPagamento;
    }

    //métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
