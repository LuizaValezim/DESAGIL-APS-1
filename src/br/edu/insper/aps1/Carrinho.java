package br.edu.insper.aps1;

import java.util.Collections;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;
	
	public Carrinho(List<Pedido> pedidos) {
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
			else if (Unitario.getProduto().getNome() != produto.getNome()){
				pedidos.add(new Pedido(produto));
			}
		}
		
	}
}
