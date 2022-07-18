package poo;

import java.util.Random;

public class Carros {
	
	int ano;
	String cor;
	
	public Carros() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	/* Construtor */
	public Carros(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	void ligar() {
		System.out.println("Desengatado");
	}
	
	void desligar() {
		System.out.println("Engatado"); 
	}
	
	void acelerar() {
		System.out.println("Andando");
	}
}
