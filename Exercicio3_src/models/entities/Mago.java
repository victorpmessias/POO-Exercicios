package models.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	private List<String> magia = new ArrayList<>();

	
	
	public Mago() {
	}
	

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}



	
	public List<String> getMagia() {
		return magia;
	}


	public void setMagia(List<String> magia) {
		this.magia = magia;
	}

	@Override
	public void lvlUp() {
		this.mana += this.level + 1;
		this.inteligencia += this.level  + 1;
	}
	
	public int attack() {
		Random rand = new Random();
		return this.inteligencia * this.level + rand.nextInt(300);
	}
}
