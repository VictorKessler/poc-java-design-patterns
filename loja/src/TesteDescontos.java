import br.com.victorkessler.loja.desconto.CalculadoraDeDescontos;
import br.com.victorkessler.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * Design Pattern usado nesse fluxo: Chain of responsability
 *
 * Conceito: Evitar o crescimento de estruturas de decisão onde se faz necessário
 *           a chamada de uma outra implementação caso a primeira não seja a adequada,
 *           se baseando no uso de herança de uma classe abstrata e classes de implementação
 *           "irmãs" que não se conhecem.
 */

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDescontos.calcular(primeiro));
        System.out.println(calculadoraDeDescontos.calcular(segundo));

    }
}
