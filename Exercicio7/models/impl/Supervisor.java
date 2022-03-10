package models.impl;

import models.Funcionario;

public class Supervisor extends Funcionario{
	
	
	
	public Supervisor() {
		super();
	}

	public Supervisor(String nome, int idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return this.getSalario() + 5000.0;
	}
}
