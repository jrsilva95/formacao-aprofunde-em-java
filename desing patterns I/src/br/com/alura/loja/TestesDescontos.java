package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        System.out.println(calculadora.calcular(orcamento1));

        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        System.out.println(calculadora.calcular(orcamento2));
    }
}