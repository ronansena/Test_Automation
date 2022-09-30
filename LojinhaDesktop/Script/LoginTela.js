
function abrirLojinha(){
  //Executando App da Lojinha Desktop
   TestedApps.Lojinha.Run();
}

function login(usuario,senha){   
    
    //clicando na aba de login    
    Aliases.Lojinha.frmPrincipal.PageControl1.ClickTab("LOGIN");
    
    //preechendo formulario de login
    let fomularioLogin = Aliases.Lojinha.frmPrincipal.PageControl1.FormularioLogin;    
    fomularioLogin.edtUsuario.SetText(usuario);
    fomularioLogin.edtSenha.SetText(senha);
    fomularioLogin.btnEntrar.ClickButton();
}
module.exports.abrirLojinha = abrirLojinha;
module.exports.login = login;