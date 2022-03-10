package app;

import java.util.ArrayList;
import java.util.List;

import models.Pessoa;

public class App {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa("João", 15);
		Pessoa pessoa2 = new Pessoa("Leandro", 21);
		Pessoa pessoa3 = new Pessoa("Paulo", 17);
		Pessoa pessoa4 = new Pessoa("Jessica", 18);
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		
		System.out.println("Exercicio 1: Pessoas mais velha");
		Pessoa maisVelho = getMaisVelho(pessoas);	
		System.out.println(maisVelho.getNome());
		
		System.out.println();
		System.out.println("Exercicio 2: Pessoas com mais de 18 anos");
		menos18(pessoas).stream().forEach(p -> System.out.println(p.getNome()));
		
		System.out.println();
	    System.out.println("Exercicio 3: Jessica esta presente ?");
	    System.out.println(pessoas.stream().anyMatch(e -> e.getNome().equals("Jessica")));
		
	}
	
	public static Pessoa getMaisVelho(List<Pessoa> pessoas) {
		int maior = Integer.MIN_VALUE;
		int indiceMaior = -1;
		for (int i = 0; i < pessoas.size(); i++) {
		    if (pessoas.get(i).getIdade() > maior) {
		        maior = pessoas.get(i).getIdade();
		        indiceMaior = i;
		    }
		}
		return pessoas.get(indiceMaior);
	}
	
	public static List<Pessoa> menos18(List<Pessoa> pessoas)  {
	      for(int i = 0; i < pessoas.size(); i++){
	        if(pessoas.get(i).getIdade() < 18){
	          pessoas.remove(i);
	        }
	      }
	       return pessoas;
	      }
	
	  }
	


