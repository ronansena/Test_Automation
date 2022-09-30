package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeAdicaoProdutoPage {

    private WebDriver navegador;

    public FormularioDeAdicaoProdutoPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public FormularioDeAdicaoProdutoPage informarONomeDoProduto(String nomeProduto){

        navegador.findElement(By.id("produtonome")).sendKeys(nomeProduto);
        return this;
    }

    public FormularioDeAdicaoProdutoPage informarOValorDoProduto(String valorProduto){

        navegador.findElement(By.id("produtovalor")).sendKeys(valorProduto);
        return this;
    }

    public FormularioDeAdicaoProdutoPage informarACorDoProduto(String corProduto){

        navegador.findElement(By.id("produtocores")).sendKeys(corProduto);
        return this;
    }

    public ListaDeProdutosPage submeterFormularioDeProdutoComErro(){

        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        return new ListaDeProdutosPage(navegador);
    }

    public FormularioDeEdicaoProdutoPage submeterFormularioDeEdicaoDeProdutoComSucesso(){

        //Adicionar produto na Lojinha
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        return new FormularioDeEdicaoProdutoPage(navegador);
    }

}
