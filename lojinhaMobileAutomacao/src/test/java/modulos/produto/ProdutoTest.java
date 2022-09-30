package modulos.produto;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import telas.LoginTela;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


@DisplayName("Testes Mobile do Módulo de Produto")
public class ProdutoTest {

    private WebDriver app;

    @DisplayName("Conectar na App Mobile")
    @BeforeEach
    public void testBeforeEach() throws MalformedURLException {

        //Abri o App
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName","NukeNoah");
        capacidades.setCapability("platform","Android");
        //capacidades.setCapability("udid","A7PRO205015451");
        capacidades.setCapability("udid","192.168.100.3:8022");
        capacidades.setCapability("appPackage", "com.lojinha");
        capacidades.setCapability("appActivity", "com.lojinha.ui.MainActivity");
        //capacidades.setCapability("app","/media/sf_E_DRIVE/TRABALHO/All_About_Test/Julio_Lima/PTQS/AULAS/Modulo_11/Material_de_Apoio/Lojinha+Android+Nativa/lojinha-nativa.apk");
        capacidades.setCapability("app","E:\\TRABALHO\\All_About_Test\\Julio_Lima\\PTQS\\AULAS\\Modulo_11\\Material_de_Apoio\\Lojinha+Android+Nativa\\lojinha-nativa.apk");
        this.app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capacidades);
        //espere cinco segundos até localizar o elemento.
        this.app.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    @DisplayName("Validação do Valor de Produto Não Permitindo")
    @Test
    public void testValidacaoDoValorDeProdutoNaoPermitido() {
        //String mensagemApresentada =
        String mensagemApresentada = new LoginTela(this.app)
                .informarUsuario("admin")
                .informarSenha("admin")
                .clicarBotaoLogin()
                .clicarBotaoAdicaoProduto()
                .preencherNomeProduto("Samsung")
                .preencherValorProduto("700001")
                .preencherCoresProduto("vermelho,azul")
                .submeterFormularioDeProdutoComErro()
                .capturarMensagemDeValidacaoAoSalvarComValorMaiorQueSeteMil();


        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00",mensagemApresentada);

    }

    @AfterEach
    public void afterEach(){

        app.quit();

    }

}

