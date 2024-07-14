package br.com.victorkessler.loja.situacao;

import br.com.victorkessler.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
    @Override
    public void finalizar(Orcamento orcamento) throws Exception {
        orcamento.setSituacao(new Finalizado());
    }
}
