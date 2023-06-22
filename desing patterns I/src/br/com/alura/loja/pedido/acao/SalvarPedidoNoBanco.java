package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido {

    public void executar(Pedido pedido){
        System.out.println("pedido salvo no banco");
    }

}
