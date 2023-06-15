package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoMaisCincoItem(
                new DescontoValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);

    }

}
