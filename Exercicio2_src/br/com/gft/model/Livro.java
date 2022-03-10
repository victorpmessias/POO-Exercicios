package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto{
	
	private String autor;
	private String tema;
	private int qtdPag;
	
	
	
	public Livro() {
	}
	
	



	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}





	public String getAutor() {
		return autor;
	}





	public void setAutor(String autor) {
		this.autor = autor;
	}





	public String getTema() {
		return tema;
	}





	public void setTema(String tema) {
		this.tema = tema;
	}





	public int getQtdPag() {
		return qtdPag;
	}





	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}



	


	@Override
	public double calculaImposto() {
		if(this.tema.equalsIgnoreCase("educativo")) {
			System.out.println("Livro educativo n�o tem imposto: " + this.getNome());
			return 0;
		};
		double imposto = this.getPreco() * 0.10;
		System.out.println(String.format("R$ %.1f", imposto) + " de impostos sobre o livro " + this.getNome() +".");
		return imposto;
	}
	
}
