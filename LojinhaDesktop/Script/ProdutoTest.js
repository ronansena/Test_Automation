var LoginTela = require("LoginTela");
var AdicionarProdutoTela = require("AdicionarProdutoTela");
var ListarProdutoTela = require("ListarProdutoTela");
var MensagemTela = require("MensagemTela");
var FormularioPrincipalTela = require("FormularioPrincipalTela");

function validarTentarInformarProdutoComValorMaiorQueSeteMil (){
  
  //validar regra de negócio valor maior que sete mil não permitido para adicionar o produto
  
    LoginTela.abrirLojinha();
    LoginTela.login("admin","admin");
    ListarProdutoTela.abrirNovoProduto();
    AdicionarProdutoTela.submeterNovoProdutoComErro("Iphone","700001","preto,azul");
    MensagemTela.validarMensagemDeErro("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.");
    MensagemTela.fecharMangemDeErro();  
    FormularioPrincipalTela.fechaAppLojinha();  
  
}

function validarTentarInformarProdutoComValorIgualAZero (){
  
    //validar regra de negócio valor igual a zero não permitido para adicionar o produto
    
    LoginTela.abrirLojinha();
    LoginTela.login("admin","admin");
    ListarProdutoTela.abrirNovoProduto();
    AdicionarProdutoTela.submeterNovoProdutoComErro("Iphone","000","preto,azul");
    MensagemTela.validarMensagemDeErro("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.");
    MensagemTela.fecharMangemDeErro();  
    FormularioPrincipalTela.fechaAppLojinha();  
  
}