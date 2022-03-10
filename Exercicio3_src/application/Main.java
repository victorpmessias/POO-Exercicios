package application;

import models.entities.Guerreiro;
import models.entities.Mago;
import models.entities.Personagem;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Personagems criados: " + Personagem.getPersonagensCriado());

		System.out.println();
		
		Mago mage1 = new Mago("Gandalf", 10, 25, 0, 5, 2 ,1);
		Guerreiro warrior1 = new Guerreiro("Arthur", 25, 2, 0, 2, 5, 1);
		
		System.out.println("Teste 1: Mago");
		testeExibir(mage1);
		System.out.println("Teste de Ataque: " + mage1.attack());
		
		System.out.println();
		
		System.out.println("Teste 2: Guerreiro");
		testeExibir(warrior1);
		System.out.println("Teste de Ataque: " + warrior1.attack());

		System.out.println();
		
		System.out.println("Teste de level up: ");

		System.out.println();
		
		mage1.lvlUp();
		warrior1.lvlUp();
		
		System.out.println("Teste 3: Mago level up");
		testeExibir(mage1);
		System.out.println("Teste de Ataque: " + mage1.attack());
		
		System.out.println();
		
		System.out.println("Teste 4: Guerreiro level up");
		testeExibir(warrior1);
		System.out.println("Teste de Ataque: " + warrior1.attack());

		System.out.println();
		
		System.out.println("Personagems criados: " + Personagem.getPersonagensCriado());
		
	}
	
	public static void testeExibir(Personagem personagem) {
		System.out.println("Nome: " + personagem.getNome());
		System.out.println("Vida: " + personagem.getVida());
		System.out.println("Mana: " + personagem.getMana());
		System.out.println("Inteligencia: " + personagem.getInteligencia());
		System.out.println("Forca: " + personagem.getForca());
		System.out.println("Xp: " + personagem.getXp());
		System.out.println("Level: " + personagem.getLevel());
	}
}
