package br.com.victorkessler.loja.imposto;

import br.com.victorkessler.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
