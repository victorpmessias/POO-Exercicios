package models.entities;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private Float km;
	private boolean isLigado = false;
	private int litrosCombustivel = 0;
	private int velocidade = 0;
	private Double preco;
	
	public Veiculo() {
	}

	public Veiculo(String marca, String modelo, String placa, String cor, Float km ,
		 Double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Float getKm() {
		return km;
	}

	public void setKm(Float km) {
		this.km = km;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}
	
	public void acelerar() {
		if(!this.isLigado) {
			System.out.println("O veiculo esta desligado");
			return;
		}
		this.velocidade += 20;
			
	}
	
	public void abastecer(int combustivel) {
		if(this.litrosCombustivel < 60) {
			this.litrosCombustivel += combustivel;
			return;
		}
		System.out.println("Capacidade maxima de combustivel atiginda!");
		
	}
	
	public void frear() {
		if(this.velocidade > 0) {
			if(!this.isLigado) {
				System.out.println("O veiculo esta desligado.");
				return;
			}
			this.velocidade -= 20;
			return;
		}
		System.out.println("O veiculo está parado.");
	}
	
	public void pintar(String cor) {
		this.cor = cor;
	}
	
	public void ligar() {
		if(!this.isLigado) {
			this.isLigado = true;
			System.out.println("O veiculo foi ligado");
			return;
		}
		System.out.println("O veiculo esta ligado.");
		return;
	}
	
	public void desligar() {
		if(this.velocidade == 0) {
			if(this.isLigado) {
				this.isLigado = false;
				System.out.println("O veiculo foi desligado!");
			} else {
				System.out.println("O veiculo ja se encontra desligado!");
				return;
			}
		} else {
			System.out.println("O veiculo não pode ser desligado em movimento!");
			return;
		}
		return;
	}
}
