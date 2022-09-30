package modulos.produtos;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.LoginPage;

import java.time.Duration;

@DisplayName("Testes Web no módulo de produtos!")
public class ProdutosTest {

    private WebDriver navegador;

    @DisplayName("Abrir navegador e maximizar")
    @BeforeEach
    public void testBeforeEach(){

        //Abrir o navegador
        System.setProperty("webdriver.chrome.driver","/opt/chromedriver");
        this.navegador = new ChromeDriver();

        //Maximar tela
        this.navegador.manage().window().maximize();

        //Vou definir um tempo de espera de 5 segundos
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Navergar para a pagina da lojinha web
        this.navegador.get("http://165.227.93.41/lojinha-web/v2/");

    }

    @Test
    @DisplayName("Não é permitido valor do produto igual a zero!")
    public void testNaoEPermitidoRegistrarProdutoIgualZero(){

        //fazer login
        //registrar os dados do produto e valor igual a zero
        // Lembra-se: ao dar entrada nos valores de automação digite sem máscara, pois quem coloca a máscara é a aplicação, e não o usuário
        //submenter o formulário
        //validar mensagem de erro apresentada
        String mensagemApresentada = new LoginPage(this.navegador)
                .informarOUsuario("admin")
                .informarASenha("admin")
                .submeterFormularioDeLogin()
                .acessarOFormularioDeNovoProduto()
                .informarONomeDoProduto("ARCADIA")
                .informarOValorDoProduto("000")
                .informarACorDoProduto("preto")
                .submeterFormularioDeProdutoComErro()
                .capturarMensagemApresentada();

                Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00",mensagemApresentada);

    }

    @Test
    @DisplayName("Não é permitido valor do produto maior que 7000,00!")
    public void testValidarValorProdutoNaoPodeSerMaiorQueSeteMil (){

        String mensagemApresentada = new LoginPage(this.navegador)
                .informarOUsuario("admin")
                .informarASenha("admin")
                .submeterFormularioDeLogin()
                .acessarOFormularioDeNovoProduto()
                .informarONomeDoProduto("ARCADIA")
                .informarOValorDoProduto("700001")
                .informarACorDoProduto("preto")
                .submeterFormularioDeProdutoComErro()
                .capturarMensagemApresentada();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00",mensagemApresentada);

    }

    @DisplayName("Posso adicionar produto com valor na faixa permitida de 0,01 à 7000,00!")
    @Test
    public void adicionarProdutoValorPermitido(){

        String mensagemApresentada = new LoginPage(this.navegador)
                .informarOUsuario("admin")
                .informarASenha("admin")
                .submeterFormularioDeLogin()
                .acessarOFormularioDeNovoProduto()
                .informarONomeDoProduto("ARCADIA")
                .informarOValorDoProduto("70000")
                .informarACorDoProduto("preto")
                .submeterFormularioDeEdicaoDeProdutoComSucesso()
                .capturarMensagemApresentada();

        Assertions.assertEquals("Produto adicionado com sucesso",mensagemApresentada);
    }

    @DisplayName("Fechando o navegador!")
    @AfterEach
    public void afterEach(){

        navegador.quit();

    }

}
