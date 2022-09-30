package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemInclusos;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojinhaApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto meuproduto = new Produto("Microsoft",Tamanho.MEDIO);

        meuproduto.setNome("Play Station 4");
        //meuproduto.setMarca("Sony");
        //meuproduto.setTamanho(Tamanho.GRANDE);
        //meuproduto.setItensInclusos(itemInclusos);

        List<ItemInclusos> listItemInclusos = new ArrayList<>();

        ItemInclusos primeiroItemInclusos = new ItemInclusos("controle PS4",2);

        /*primeiroItemInclusos.setNome("controle PS4");
        primeiroItemInclusos.setQuantidade(2);*/
        listItemInclusos.add(primeiroItemInclusos);

        ItemInclusos segundoItemInclusos = new ItemInclusos("cabo de energia",1);

        /*segundoItemInclusos.setNome("cabo de energia");
        segundoItemInclusos.setQuantidade(1);*/
        listItemInclusos.add(segundoItemInclusos);

        meuproduto.setItensInclusos(listItemInclusos);

        //System.out.println("Digite o valor:");
        //meuproduto.setValor(sc.nextDouble());

        meuproduto.setValor(233);
        System.out.println(meuproduto.getNome());
        System.out.println(meuproduto.getMarca());
        System.out.println(meuproduto.getValor());
        System.out.println(meuproduto.getTamanho());
        System.out.println("Apresentando itens início:");
        for(int i=0;i<meuproduto.getItensInclusos().size();i++){

            System.out.println(meuproduto.getItensInclusos().get(i).getNome());
            System.out.println(meuproduto.getItensInclusos().get(i).getQuantidade());

        }

        for(ItemInclusos itemAtual : meuproduto.getItensInclusos()){

            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());

        }
        System.out.println("Apresentando itens fim");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Havaiana",Tamanho.GRANDE);

        System.out.println(meuProdutoNacional.getMarca());
        meuProdutoNacional.setImpostoNacional(33.65);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Iphone",Tamanho.MEDIO);
        System.out.println(meuProdutoInternacional.getMarca());
        meuProdutoInternacional.settaxaImportacao(1500);
        System.out.println(meuProdutoInternacional.gettaxaImportacao());

        meuProdutoInternacional.setValor(-100);

    }

}



