package models.impl;

import models.Funcionario;

public class Vendedor extends Funcionario{
	
	
	
	public Vendedor() {
		super();
	}

	public Vendedor(String nome, int idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return this.getSalario() + 3000.0;
	}
}
