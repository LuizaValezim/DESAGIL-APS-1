package br.edu.insper.aps1;

import static org.junit.Assert.assertEquals;

public class Testador {
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(0, totalCarrinho, 0.000001);
		
		return true;
	}

	public boolean testeB() {
		Produto produto = new Produto(123, "camiseta", 99.99);
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		caixa.adicionarCaixa(produto, 0);
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(99.99, totalCarrinho, 0.000001);
		
		return true;
	}

	public boolean testeC() {
		Produto produto = new Produto(123, "camiseta", 99.99);
		Pedido pedido = new Pedido(produto);
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		caixa.adicionarCaixa(produto, 10);
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(89.991, totalCarrinho, 0.000001);
		
		return true;
	}

	public boolean testeD() {
	    return false;
	}

	public boolean testeE() {
	    return false;
	}
}
