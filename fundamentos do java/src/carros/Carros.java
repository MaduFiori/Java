/**
 * Atividade Carros
 */
package carros;

/**
 * @author Maria Fiori
 * Classe responsável pela criação dos objetos
 */
public class Carros {

	public Carros() {
		super();
		System.out.println("-----------------------");
	}
		//variáveis
		int ano;
		String cor;
		String modelo;
		Random chassi = new Random;

		// Voids
		void ligar() {
			System.out.println("Veículo Ligando");
		}

		void desligar() {
			System.out.println("Veículo Desligando");
		}

		void acelerar() {
			System.out.println("Veículo acelerando");
		}
		void frear() {
			System.out.println("Veículo Freando");
		}
		
	}
