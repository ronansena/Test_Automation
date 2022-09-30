function validarMensagemDeErro(mensagem){
  //valida mensagem de erro apresentada com a informada na chamada do método
  aqObject.CheckProperty(Aliases.Lojinha.dlgLojinha.Static, "WndCaption", cmpEqual, mensagem);

}

function fecharMangemDeErro(){
  //fecha a mensagem de erro
  Aliases.Lojinha.dlgLojinha.btnOK.ClickButton();
  
}
module.exports.validarMensagemDeErro = validarMensagemDeErro;
module.exports.fecharMangemDeErro = fecharMangemDeErro;