package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeAdicaoProdutoTela extends BaseTela {

    public FormularioDeAdicaoProdutoTela(WebDriver app) {
        super(app);
    }

    public FormularioDeAdicaoProdutoTela preencherNomeProduto (String nomeProduto){

        app.findElement(By.id("com.lojinha:id/productName")).click();
        app.findElement(By.id("com.lojinha:id/productName")).findElement(By.id("com.lojinha:id/editText")).sendKeys(nomeProduto);

        return this;
    }

    public FormularioDeAdicaoProdutoTela preencherValorProduto (String valorProduto){

        app.findElement(By.id("com.lojinha:id/productValue")).click();
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(valorProduto);

        return this;
    }

    public FormularioDeAdicaoProdutoTela preencherCoresProduto (String coresProduto){

        app.findElement(By.id("com.lojinha:id/productColors")).click();
        app.findElement(By.id("com.lojinha:id/productColors")).findElement(By.id("com.lojinha:id/editText")).sendKeys(coresProduto);

        return this;
    }

    public FormularioDeAdicaoProdutoTela submeterFormularioDeProdutoComErro(){

        app.findElement(By.id("com.lojinha:id/saveButton")).click();

        return this;
    }

    //Validar que a mensagem de valor inválido foi apresentada.
    public String capturarMensagemDeValidacaoAoSalvarComValorMaiorQueSeteMil(){

        return  capturarToast();

    }




}
