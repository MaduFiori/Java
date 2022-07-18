/**
 * 
 */
package estudos;

/**
 * @author Maria Fiori
 * Fundamnentos
 */
public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade = 18; 
		char sexo = 'F';
		double temperatura = 25.4;
		boolean arCondicionado = false;
		nome = "Maria Eduarda";
		System.out.println("Uso de variáveis na linguagem JAVA");
		System.out.println("");
		
		System.out.println("Exemplos: ");
		System.out.println( "Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("ArCondicionado: " + arCondicionado);
		
		System.out.println("______________________________");
		System.out.println("");
		
		double i = 10;
		System.out.println("Operadores aritmétricos e atribuições");
		System.out.println("Exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 = " + (i+5));
		System.out.println("i = " + i + " - 5 = " + (i-5));
		System.out.println("i = " + i + " x 5 = " + (i*5));
		System.out.println("i = " + i + " / 5 = " + (i/5));
		System.out.println("i = " + i + " % 5 = " + (i%5));
		System.out.println("i = " + i +" += 5 = " + (i+=5));
		System.out.println("i = " + i +" -= 5 = " + (i-=5));
		System.out.println("i = " + i +" *= 5 = " + (i*=5));
		System.out.println("i = " + i +" /= 5 = " + (i/=5));
		i++;
		System.out.println("i = " + i);
		i--;
		System.out.println("i = " + i);
		
		System.out.println("______________________________");
		System.out.println("");
		
		System.out.println("Estruturas de repetições");
		System.out.println("Exemplos do uso for: ");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		
		System.out.println("______________________________");
		System.out.println("");
		System.out.println("Estruturas de repetições");
		System.out.println("Exemplos while e do-while: ");
		System.out.println("");
		System.out.println("while:");
		System.out.println("");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		
		System.out.println("Do while:");
		System.out.println("");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente (s/n)? ");
			novoJogo = 'n';
		}while (novoJogo == 's');
		System.out.println("Game over!");
	}

}
