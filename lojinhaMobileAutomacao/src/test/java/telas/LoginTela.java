package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTela extends BaseTela{

    public LoginTela(WebDriver app) {
        super(app);
    }

    public LoginTela informarUsuario(String usuario){

        app.findElement(By.id("com.lojinha:id/user")).click();
        app.findElement(By.id("com.lojinha:id/user")).findElement(By.id("com.lojinha:id/editText")).sendKeys(usuario);

        return this;
    }

    public LoginTela informarSenha(String password){

        app.findElement(By.id("com.lojinha:id/password")).click();
        app.findElement(By.id("com.lojinha:id/password")).findElement(By.id("com.lojinha:id/editText")).sendKeys(password);

        return this;
    }

    public ListaDeProdutosTela clicarBotaoLogin(){

        app.findElement(By.id("com.lojinha:id/loginButton")).click();

        return new ListaDeProdutosTela(app);

    }

}
