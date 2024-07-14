package br.com.victorkessler.loja.situacao;

import br.com.victorkessler.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) throws Exception {
        throw new Exception("Orcamento nao pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) throws Exception {
        throw new Exception("Orcamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) throws Exception {
        throw new Exception("Orcamento nao pode ser finalizado!");
    }
}
