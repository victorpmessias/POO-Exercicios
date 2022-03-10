package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String nome;
	private String cnpj;
	private List<Livro> livros = new ArrayList<>();
	private List<VideoGame> videoGames = new ArrayList<>();
	public Loja() {
	}
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<VideoGame> getVideoGames() {
		return videoGames;
	}
	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		if(this.livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque");
			return;
		}
		System.out.println("---------------------------------");
		System.out.println("A loja Americanas possui estes livros para venda:");
		this.livros.stream().forEach(
				livro -> System.out.println("Titulo:"
						+livro.getNome()
						+", preço: "
						+ livro.getPreco()
						+ ", quantidade: "
						+livro.getQtd()
						+ " em estoque."
						));
	}
	
	public void listaVideoGames(){
		if(this.videoGames.isEmpty()) {
			System.out.println("A loja não tem video-games no seu estoque");
			return;
		}
		System.out.println("---------------------------------");
		System.out.println("A loja Americanas possui estes livros para venda:");
		this.videoGames.stream().forEach(
				game -> System.out.println("Titulo: "
						+game.getNome()
						+" " + game.getIsUsado()
						+", preço: "
						+ game.getPreco()
						+ ", quantidade: "
						+game.getQtd()
						+ " em estoque."
						));
	}
	
	public double calcularPatrimonio(){
		double soma = 0d;
		if(!this.livros.isEmpty()) {
			for(int i = 0; i < this.livros.size(); i++) {
				soma += this.livros.get(i).getPreco() * this.livros.get(i).getQtd();
			}
		}
		
		if(!this.videoGames.isEmpty()) {
			for(int i = 0; i < this.videoGames.size(); i++) {
				soma += this.videoGames.get(i).getPreco() * this.videoGames.get(i).getQtd() ;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("O patrimônio da loja: Americanas é de R$ " + String.format("%.1f.", soma));
		return soma;
	}

	
	
	
}
