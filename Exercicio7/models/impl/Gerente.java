package models.impl;

import models.Funcionario;

public class Gerente extends Funcionario{
	
	public Gerente() {
		super();
	}
	
	public Gerente(String nome, int idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return this.getSalario() + 10000.0;
	}
}
