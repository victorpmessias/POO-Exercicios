package main;

import models.Funcionario;
import models.impl.Gerente;
import models.impl.Supervisor;
import models.impl.Vendedor;

public class Main {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Robson", 50, 6000.0);
		Funcionario supervisor = new Supervisor("Cleiton", 50, 4000.0);
		Funcionario vendedor = new Vendedor("Joao", 50, 2000.0);
		
		System.out.println("Gerente: " +gerente.toString()+ "bonificação" + gerente.bonificacao());
		System.out.println("Supervisor: " +supervisor.toString()+ "bonificação" + supervisor.bonificacao());
		System.out.println("Vendedor: " +vendedor.toString()+ "bonificação" + vendedor.bonificacao());
	}
}
