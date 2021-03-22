package br.edu.insper.aps1;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
        this.produto = produto;
        this.quantidade = 1;
    }
	
	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public int adicionaProduto() {
		return this.quantidade+1;
	}

	public double devolveTotal() {
		return (produto.getPreço() * this.quantidade);
	}

	public double totalCompra() {
		return 0;
	}

}
