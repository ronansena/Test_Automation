package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {

    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemInclusos> itensInclusos;

    public Produto(String marcaInicial,Tamanho tamanhoInicial){
        this.nome = "Xbox";
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }
    public double getValor(){
        return this.valor;
    }

    public void setValor(double novoValor){
        if(novoValor >0) {
            this.valor = novoValor;
        }else{
            System.out.println("Valor não pode ser igual a zero!");
            throw new IllegalArgumentException("Valor não pode ser igual a zero!");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String novoMarca){
        this.marca = novoMarca;
    }

    public Tamanho getTamanho(){
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho){
        this.tamanho = novoTamanho;
    }


    public List<ItemInclusos> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<ItemInclusos> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
