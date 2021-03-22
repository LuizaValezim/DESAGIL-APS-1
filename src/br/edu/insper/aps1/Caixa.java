package br.edu.insper.aps1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> descontos;
	
	public Caixa() {
		super();
		descontos = new HashMap<Integer, Integer>();    
    }
	
	public void adicionarDesconto(Produto produto, int desconto) {
		if ((desconto<1)||(desconto>99)) return;
		descontos.put(produto.getCódigo(), desconto);
	}
	
	public double mostrarTotal(Carrinho carrinho) {
		double totalCompra = 0;
		for (Pedido Unitario: carrinho.getListaPedidos()) {
			double total = Unitario.totalCompra();
			int desconto = 0;
			int codigo = Unitario.getProduto().getCódigo();
			
			if(descontos.containsKey(codigo)) {
				desconto = descontos.get(codigo);
			}
			
			totalCompra += total*(1-((double)desconto/100));
		}
		return totalCompra;
	}
}