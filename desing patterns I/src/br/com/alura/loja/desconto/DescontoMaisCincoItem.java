package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisCincoItem extends Desconto{

    public DescontoMaisCincoItem(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){

        if (orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);

    }

}
