package contas;

public class PessoaFisica {
	
	public static void main(String[] args){
		Conta conta1 = new Conta();
		conta1.setCliente("Maria Eduarda");
		conta1.setsaldo(15000);
		conta1.tipo = "Corrente";
		System.out.println("Cliente: " + conta1.getCliente());
		System.out.println("Conta: " + conta1.tipo);
		conta1.exibirSaldo();
		conta1.sacar(50);
		conta1.exibirSaldo();
		
		System.out.println("-------------------------------");
		
		Conta conta2 = new Conta();
		conta2.setCliente("Katia Maria");
		conta2.setsaldo(2000);
		conta2.tipo = "Poupança";
		System.out.println("Cliente: " + conta2.getCliente());
		System.out.println("Conta: " + conta2.tipo);
		conta2.exibirSaldo();
		conta2.depositar(1000);
		conta2.exibirSaldo();
		
		System.out.println("-------------------------------");
		
		System.out.println("Transferência: ");
		conta1.exibirSaldo();
		System.out.println("De: " + conta1.getCliente());
		System.out.println("Para: " + conta2.getCliente());
		conta1.transferir(conta2, 1500);
		conta1.exibirSaldo();
		
		System.out.println("-------------------------------");
		
		Conta gerente = new Conta();
		double relatorio = gerente.soma(conta1.setsaldo(), conta2.setsaldo());
		System.out.println("Saldo total das contas: R$ " + relatorio);
		
		
	}
}
