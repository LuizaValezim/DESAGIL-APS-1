package br.edu.insper.aps1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Carrinho {
	private List<Pedido> listaPedidos;
	
	public Carrinho() {
		super();
        this.listaPedidos = new ArrayList<Pedido>();    
        }
	
	public void insereCarrinho(Produto produto) {
		
		for (Pedido Unitario: listaPedidos) {
			if (Unitario.getProduto().getCódigo() == produto.getCódigo()) {
				Unitario.adicionaProduto();
				return;
				
			}
		}

		listaPedidos.add(new Pedido(produto));
		
		}
		
	public List<Pedido> getListaPedidos() {
		return listaPedidos;
	}
		
}
