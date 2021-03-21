package br.edu.insper.aps1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;
	
	public Carrinho() {
        this.pedidos = Collections.emptyList();
    }

	public List<Pedido> getPedido() {
		return this.pedidos;
	}
	
	public void insereCarrinho(Produto produto) {
		
		for (Pedido Unitario: pedidos) {
			if (Unitario.getProduto().getNome() == produto.getNome()) {
				Unitario.adicionaProduto();
				
			}
		}
		if (Arrays.asList(pedidos).contains(produto.getNome()) == false) {
			pedidos.add(new Pedido(produto));
		}
		
	}
		
}
