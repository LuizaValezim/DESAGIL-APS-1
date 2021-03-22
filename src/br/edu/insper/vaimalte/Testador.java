package br.edu.insper.vaimalte;

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
		Produto produto1 = new Produto(01, "Skol", 4.00);
		
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		carrinho.insereCarrinho(produto1);
		caixa.adicionarDescontoCaixa(produto1, 0);
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(4.0, totalCarrinho, 0.000001);
		
		return true;
	}

	public boolean testeC() {
		Produto produto1 = new Produto(01, "Brahma", 3.00);
		
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		carrinho.insereCarrinho(produto1);
		
		caixa.adicionarDescontoCaixa(produto1, 10);
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(2.7, totalCarrinho, 0.000001);
		
		return true;
	}

	public boolean testeD() {
		Produto produto1 = new Produto(01, "Stella Artois", 5.0);
		Produto produto2 = new Produto(02, "Heineken", 5.5);
		
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		carrinho.insereCarrinho(produto1);
		carrinho.insereCarrinho(produto2);
		carrinho.insereCarrinho(produto2);
		
		caixa.adicionarDescontoCaixa(produto1, 10);
		caixa.adicionarDescontoCaixa(produto2, 0);
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(15.5, totalCarrinho, 0.000001);
		
	    return true;
	}

	public boolean testeE() {
		Produto produto1 = new Produto(01, "Colorado", 9.00);
		Produto produto2 = new Produto(02, "Budweiser", 6.50);
		
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		carrinho.insereCarrinho(produto1);
		carrinho.insereCarrinho(produto1);
		carrinho.insereCarrinho(produto2);
		
		caixa.adicionarDescontoCaixa(produto1, 20);
		caixa.adicionarDescontoCaixa(produto2, 0);
		
		double totalCarrinho = caixa.mostrarTotal(carrinho);
		
		assertEquals(20.9, totalCarrinho, 0.000001);
		
		return true;
	}
}
