package br.com.lojinha.pojo;

public class ItemInclusos {

    private String nome;
    private int quantidade;

    public ItemInclusos(String nomeInicial,int quantidadeInicial){
        this.nome = nomeInicial;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
