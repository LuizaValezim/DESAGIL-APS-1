package br.edu.insper.vaimalte;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
        this.produto = produto;
        this.quantidade = 1;
    }
	
	public Produto getProduto() {
		return this.produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}
	
	public int adicionaProduto() {
		return this.quantidade+1;
	}

	public double devolveTotal() {
		return (produto.getPreço() * this.quantidade);
	}

}
