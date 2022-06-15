/**
 * 
 */
package minecraft;

/**
 * @author maria.efiori
 *
 */
public class Itens {

	/**
	 * 
	 */
	public Itens() {
		
	}

	/**
	 * método principal
	 * @param args
	 */
	public static void main(String[] args) {
		Enxada enxadaDiamante = new Enxada();
		enxadaDiamante.resistencia = 10;
		enxadaDiamante.textura = "Diamante";
		enxadaDiamante.conquista = false;
		System.out.println("Enxada de "+ enxadaDiamante.textura);
		System.out.println("Resistência: "+ enxadaDiamante.resistencia);
		enxadaDiamante.arar();
		
		if(enxadaDiamante.conquista == true) {
			System.out.println("---------------------------------");
			System.out.println("Conquista desbloqueada");
			System.out.println("Dedicação séria. Hora do plantio");
			System.out.println("---------------------------------");
		}

	}

}
