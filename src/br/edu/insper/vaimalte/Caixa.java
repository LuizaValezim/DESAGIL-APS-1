package br.edu.insper.vaimalte;

import java.util.Map;
import java.util.HashMap;


public class Caixa {
	private Map<Integer, Integer> descontos;
	
	public Caixa() {
		this.descontos = new HashMap<Integer, Integer>(); 
    }
	
	public void adicionarDescontoCaixa(Produto produto, int desconto) {
		if ((desconto>=1)&&(desconto<=99)){
			descontos.put(produto.getCódigo(), desconto);
		}
	}
	
	public double mostrarTotal(Carrinho carrinho) {
		double compraTotal = 0;
		for (Pedido unidade: carrinho.getPedido()) {
			if(descontos.containsKey(unidade.getProduto().getCódigo())) {
				compraTotal += (1-((descontos.get(unidade.getProduto().getCódigo())*0.01)))*unidade.devolveTotal();
			}
			else {
				compraTotal += unidade.devolveTotal();
			}
		}
		return compraTotal;
	}
}