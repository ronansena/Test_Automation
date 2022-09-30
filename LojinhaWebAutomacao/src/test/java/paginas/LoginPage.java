package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Exemplo de utilização de estrutura PageObjects
public class LoginPage {

    private WebDriver navegador;

    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public LoginPage informarOUsuario(String usuario){

        navegador.findElement(By.cssSelector("label[for='usuario']")).click();
        navegador.findElement(By.id("usuario")).sendKeys(usuario);
        //Exemplo de utilização Fluent Page Object Pattern
        return this;
    }

    public LoginPage informarASenha(String senha) {

        navegador.findElement(By.cssSelector("label[for='senha']")).click();
        navegador.findElement(By.id("senha")).sendKeys(senha);

        return this;
    }

    public ListaDeProdutosPage submeterFormularioDeLogin(){

        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        return new ListaDeProdutosPage(navegador);
    }

}
