package br.edu.insper.vaimalte;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
	private List<Pedido> pedidos;
	
	public Carrinho() {
        this.pedidos = new ArrayList<Pedido>();
    }

	public List<Pedido> getPedido() {
		return this.pedidos;
	}
	
	public void insereCarrinho(Produto produto) {
		
		for (Pedido unidade: pedidos) {
			if (unidade.getProduto().getNome() == produto.getNome()) {
				unidade.adicionaProduto();
				
			}
		}
		pedidos.add(new Pedido(produto)); 
	}
		
}
