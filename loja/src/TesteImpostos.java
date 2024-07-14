import br.com.victorkessler.loja.imposto.CalculadoraDeImpostos;
import br.com.victorkessler.loja.imposto.ISS;
import br.com.victorkessler.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * Design Pattern usado nesse fluxo: Strategy
 *
 * Conceito: Evitar o crescimento de laços de decisão, se baseando no uso
 *           de herança e polimorfismo, com classes que implementam uma interface ao seu modo
 *           e a classe responsável por ser chamada não tem conhecimento das classes que implementam
 *           a interface.
 *
 */

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
    }
}