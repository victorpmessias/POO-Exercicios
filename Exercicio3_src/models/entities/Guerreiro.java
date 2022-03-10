package models.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	private List<String> habilidades = new ArrayList<>();

	public Guerreiro() {
		super();
	}

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
	@Override
	public void lvlUp() {
			this.vida += this.level  + 1;
			this.forca += this.level  + 1;
		
	}
	
	public int attack() {
		Random rand = new Random();
		return  (this.forca * this.level) + rand.nextInt(300);
	}
}
