package br.com.cotiinformatica.domain.contracts.components;

import br.com.cotiinformatica.domain.models.dtos.ProdutoHistorico.TipoAcao;
import br.com.cotiinformatica.domain.models.dtos.ProdutoResponse;

public interface ProdutoHistoricoMessage {
	
	public void criarHistorico(ProdutoResponse produto, TipoAcao acao);

}
