package models.entities;

public abstract class Personagem {
	protected String nome;
	protected int vida;
	protected int mana;
	protected float xp;
	protected int inteligencia;
	protected int forca;
	protected int level;
	protected static int personagensCriado = 0;
	
	public static int getPersonagensCriado() {
		return personagensCriado;
	}

	private static void attLista() {
		Personagem.personagensCriado += 1;
	}
	public Personagem() {
		attLista();
	}
	
	public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
		attLista();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	public void lvlUp() {
		this.vida += this.level  + 1;
		this.forca += this.level  + 1;
		this.mana += this.level + 1;
		this.inteligencia += this.level  + 1;
	};
	
}
