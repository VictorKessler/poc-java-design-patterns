package br.com.victorkessler.loja.imposto;

import br.com.victorkessler.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
