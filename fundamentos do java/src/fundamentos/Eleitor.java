/** 
 * Fundamentos do Java
 * Variáveis, operadores e estruturas de contrrole
 * Exercício 1 - APP Eleitor
 * Desenvolver um app no modo console que em função da idade do eleitor avise
 * se o voto é obrigatório ou não
 * Abaixo de 16 anos - VOTO PROIBIDO
 * Entre 18 a 70 (incluindo 18 e 70) - VOTO OBRIGATÓRIO
 * 16,17 ou acima de 70 - VOTO FACULTATIVO 
 */

package fundamentos;

import java.util.Scanner;

/** 
 * author Maria Fiori
 */

public class Eleitor {
	/** 
	 * Método principal
	 * @param args
	 */

	public static void main(String[] args) {
		// variáveis
		int idade;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("APP ELEITOR ================");
		System.out.println("Digite sua idade: ");
		
		//entrada de dados
		idade = teclado.nextInt();
		
		// Apoio ao teste do fluxo (verificar se a variável foi capturada) 
		//System.out.println(idade);
		
		// Processamento e saída
		if (idade <= 16 ) {
			System.out.println("PROIBIDO VOTAR");
			
		} else if(idade >=18 && idade <71) {
			System.out.println("VOTO OBRIGATÓRIO");
			
		} else {
			System.out.println("VOTO FACULTATIVO");
		}
		
		//encerrar a captura de dados
		teclado.close();
	}

}
