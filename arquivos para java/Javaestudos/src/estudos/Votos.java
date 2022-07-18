/**
 * 
 */
package estudos;

import java.util.Scanner;

/**
 * @author Maria Fiori
 * Eleição
 */
public class Votos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Seu voto é obrigatótio ou facultativo?");
		System.out.println("");
		int idade;
		System.out.println("Digite a sua idade: ");
		idade = teclado.nextInt();
		
		if(idade <=16) {
			System.out.println("Voto proibido!");
		}
		
		else if(idade >= 18 && idade <69) {
			System.out.println("Voto obrigatório!");
		}
		
		else {
			System.out.println("Voto facultativo!");
		}

	}

}
