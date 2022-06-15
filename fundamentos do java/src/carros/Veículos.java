/**
 * Atividade Carros
 */
package carros;

import java.util.Random;

/**
 * @author Maria Fiori
 *
 */
public class Veículos {

	/**
	 * Método Principal
	 * @param args
	 */
	public static void main(String[] args) {
		// Carro 1
		Carros carroAzul = new Carros();
		carroAzul.ano = 2002;
		carroAzul.cor = "Azul";
		carroAzul.modelo = "Fusca";
		System.out.println("Cor Do Carro: " + carroAzul.cor);
		System.out.println("Ano Do Carro: " + carroAzul.ano);
		System.out.println("Modelo Do Carro: " + carroAzul.modelo);
		carroAzul.ligar();
		carroAzul.acelerar();
		carroAzul.frear();
		carroAzul.desligar();
		
		// Carro 2
		Carros carroVermelho = new Carros();
		carroVermelho.ano = 2022;
		carroVermelho.cor = "Vermelho";
		carroVermelho.modelo = "Ferrari";
		Random chassi = new Random();
		System.out.println("Cor Do Carro: " + carroVermelho.cor);
		System.out.println("Ano Do Carro: " + carroVermelho.ano);
		System.out.println("Modelo Do Carro: " + carroVermelho.modelo);
		carroVermelho.ligar();
		carroVermelho.acelerar();
		carroVermelho.frear();
		carroVermelho.desligar();
		
		// Avião 1
		Avião aviãobranco = new Avião();
		aviãobranco.ano = 2009;
		aviãobranco.cor = "Branco";
		aviãobranco.modelo = "Teco teco";
		aviãobranco.envergadura = "60.9";
		System.out.println("Cor do avião: " + aviãobranco.cor);
		System.out.println("Ano do avião: " + aviãobranco.ano);
		System.out.println("Modelo do avião: " + aviãobranco.modelo);
		System.out.println("Envergadura:"+aviãobranco.envergadura);
		aviãobranco.decolar();
		aviãobranco.aterrizar();
		
		
	}
	}


