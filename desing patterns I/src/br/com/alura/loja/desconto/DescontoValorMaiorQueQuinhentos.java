package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaiorQueQuinhentos extends Desconto {

    public DescontoValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }

}
