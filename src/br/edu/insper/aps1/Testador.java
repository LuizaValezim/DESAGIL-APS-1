package br.edu.insper.aps1;

import static org.junit.Assert.assertEquals;

public class Testador {
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(0.0, totalCarrinho, 0.000001);
		
		return true;
	}

	public boolean testeB() {
		Produto produto = new Produto(123, "Camiseta", 99.99);
		Carrinho carrinho = new Carrinho();
		carrinho.insereCarrinho(produto);
		Caixa caixa = new Caixa();
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(99.99, totalCarrinho, 0.000001);
		
		return true;
	}

	public boolean testeC() {
		Produto produtoUm = new Produto(001, "Calça", 149.99);
		Carrinho carrinho = new Carrinho();
		carrinho.insereCarrinho(produtoUm);
		Caixa caixa = new Caixa();
		caixa.adicionarDesconto(produtoUm, 40);
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(89.994, totalCarrinho, 0.000001);
		
		return false;
	}

	public boolean testeD() {
		Produto produtoUm = new Produto(001, "Calça", 149.99);
		Produto produtoDois = new Produto(002, "Meia", 24.99);
		
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		carrinho.insereCarrinho(produtoUm);
		carrinho.insereCarrinho(produtoDois);
		carrinho.insereCarrinho(produtoDois);
		
		caixa.adicionarDesconto(produtoUm, 35);
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(182.477, totalCarrinho, 0.000001);
		
		return true;
	}

	public boolean testeE() {
		Produto produtoUm = new Produto(001, "Calça", 149.99);
		Produto produtoDois = new Produto(002, "Meia", 24.99);
		
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		carrinho.insereCarrinho(produtoUm);
		carrinho.insereCarrinho(produtoUm);
		carrinho.insereCarrinho(produtoDois);
		
		caixa.adicionarDesconto(produtoUm,30);
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(234.976, totalCarrinho, 0.000001);
		
	    return true;
	}
}
