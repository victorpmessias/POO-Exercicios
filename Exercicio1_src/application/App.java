package application;

import models.entities.Veiculo;

public class App {
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("Hyunday", "HB20", "abc1234", "Azul", 0f, 80.000);
		
		veiculo.abastecer(50);
		System.out.println(veiculo.getLitrosCombustivel());
		System.out.println(veiculo.getCor());
		veiculo.pintar("verde");
		System.out.println(veiculo.getCor());
		
		veiculo.acelerar();
		System.out.println(veiculo.getVelocidade());
		veiculo.ligar();
		veiculo.acelerar();
		System.out.println(veiculo.getVelocidade());
		
		veiculo.frear();
		System.out.println(veiculo.getVelocidade());
		veiculo.frear();
		
		veiculo.desligar();
		veiculo.desligar();
	}
}
