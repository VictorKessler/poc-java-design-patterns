package br.com.victorkessler.loja.desconto;

import br.com.victorkessler.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

   public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                                        new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                                            new SemDesconto()
                                        )
                                    );

        return cadeiaDeDescontos.calcular(orcamento);
   }
}
