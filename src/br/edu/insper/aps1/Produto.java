package br.edu.insper.aps1;

public class Produto {
	private int código;
	private String nome;
	private double preço;
	
	public Produto(int código, String nome, double preço) {
        this.código = código;
        this.nome = nome;
        this.preço = preço;
    }

	public int getCódigo() {
		return this.código;
	}

	public String getNome() {
		return this.nome;
	}

	public double getPreço() {
		return this.preço;
	}
	
}
