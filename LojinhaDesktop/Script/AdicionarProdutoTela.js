function submeterNovoProdutoComErro(nome,valor,cores){
  
  //informar dados do produto
  let formularioAdicionarProduto = Aliases.Lojinha.frmPrincipal.PageControl1.FormularioAdicionarProduto.Panel6;  
  formularioAdicionarProduto.edtNovoNomeProduto.SetText(nome);
  formularioAdicionarProduto.edtNovoValorProduto.SetText(valor);
  formularioAdicionarProduto.edtNovoCoresProduto.SetText(cores);
  // acionar botão para salvar o produto
  formularioAdicionarProduto.btnSalvarProduto.ClickButton();
  
}

module.exports.submeterNovoProdutoComErro = submeterNovoProdutoComErro;