package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor){
        if(novoValor > -100) {
            this.valor = novoValor;
        }else{
            System.out.println("Valores devem ser maiores que -100!");
            throw new IllegalArgumentException("Valores devem ser maiores que -100!");
        }
    }

    public double gettaxaImportacao() {
        return taxaImportacao;
    }

    public void settaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public String getDadosFavoritos() {
        return getNome() + " , " + getMarca() + " , " + getValor();
    }
}
