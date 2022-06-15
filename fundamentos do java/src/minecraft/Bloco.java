/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author Maria Fiori 
 * Classe Modelo
 */
public class Bloco {
	/***
	 * Construtor
	 */
	public Bloco() {
		super();
		System.out.println("-----------------------");
	}

	// Textura
	int resistencia;
	String textura;

	// Métodos
	// Void -> Método simples sem retorno
	void construir() {
		System.out.println("Bloco colocado");
	}

	void minerar() {
		System.out.println("Recursos obtidos");
	}

	void craftar() {
		System.out.println("Item criado");
	}
}
