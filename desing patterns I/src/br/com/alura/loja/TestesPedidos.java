package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBanco;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = "ana";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler hander = new GeraPedidoHandler(Arrays.asList(new EnviarEmailPedido(), new SalvarPedidoNoBanco())); //com as dependencias
        hander.execute(gerador);

    }

}
