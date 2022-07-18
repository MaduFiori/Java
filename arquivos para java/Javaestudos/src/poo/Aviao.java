package poo;

import java.util.Random;

public class Aviao {
	
	int ano;
	String modelo;
	String cor;
	String envergadura;
	
	public Aviao() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	void decolar() {
		System.out.println("Decolando");
	}
	
	void aterrizar() {
		System.out.println("Aterrizando");
	}
}
	
