package br.com.victorkessler.loja.orcamento;

import br.com.victorkessler.loja.situacao.EmAnalise;
import br.com.victorkessler.loja.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeitens;
    private SituacaoOrcamento situacao;
    
    public Orcamento(BigDecimal valor, int quantidadeitens) {
        this.valor = valor;
        this.quantidadeitens = quantidadeitens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        try {
            this.situacao.aprovar(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void reprovar() {
        try {
            this.situacao.reprovar(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void finalizar() {
        try {
            this.situacao.finalizar(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeitens() {
        return quantidadeitens;
    }

    public void setSituacao(SituacaoOrcamento situacaoOrcamento) {
        this.situacao = situacaoOrcamento;
    }
}
