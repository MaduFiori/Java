package seguros;

import contas.Conta;

public class SeguroPessoaFisica {

	public static void main(String[] args) {
		Conta conta3 = new Conta();
		conta3.setCliente("Heritiero Lima");
		conta3.setsaldo(5000);
		conta3.tipo = "Corrente";
		System.out.println("Cliente: " + conta3.getCliente());
		System.out.println("Conta: " + conta3.tipo);
		conta3.exibirSaldo();
		
		System.out.println("-------------------------------");
		
	}

}
