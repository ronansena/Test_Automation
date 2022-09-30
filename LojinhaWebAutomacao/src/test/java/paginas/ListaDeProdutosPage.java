package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDeProdutosPage {

    private WebDriver navegador;

    public ListaDeProdutosPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public FormularioDeAdicaoProdutoPage acessarOFormularioDeNovoProduto(){

        //Adicionar produto na Lojinha
        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();

        return new FormularioDeAdicaoProdutoPage(navegador);
    }

    public String capturarMensagemApresentada(){

        return navegador.findElement(By.cssSelector(".toast.rounded")).getText();

    }
}
