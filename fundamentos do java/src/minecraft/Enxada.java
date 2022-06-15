/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author Maria Fiori
 * Classe Modelo com herança (extends)
 *
 */
public class Enxada extends Bloco{

	/**
	 * Construtor
	 */
	public Enxada() {
		System.out.println("_______ CAMPO _________");
	}
		//atributos
		boolean conquista;
		
		//método
		/**
		 * Método para arar a terra
		 */
		void arar() {
			System.out.println("Terra para o plantio");

		//Atenção!
		conquista = true;
		
		}

}
