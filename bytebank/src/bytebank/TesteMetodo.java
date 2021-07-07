package bytebank;

public class TesteMetodo { 
	public static void main (String[] args) {
		//Instancias e Veriáveis
		
		Cliente raziel = new Cliente("Raziel Leone", "111.111.111-11", "Arquiteto");
		Cliente sarah  = new Cliente("Sarah Zelo", "222.222.222-22", "Designer");
		Conta contaDaSarah = new ContaCorrente(sarah, 1234, 5678);
		Conta contaDoRaziel = new ContaPoupanca(raziel, 8765, 4321);
		
		//Teste dos Métodos Conta
		contaDaSarah.depositar(1000);
		contaDoRaziel.depositar(300);
		System.out.println("\nSarah"+contaDaSarah+"\nRaziel"+contaDoRaziel);
		contaDaSarah.sacar(200);
		contaDoRaziel.sacar(400);
		System.out.println("\nTeste Saque \nSarah "+contaDaSarah+"\nRaziel"+contaDoRaziel);
		contaDaSarah.transferir(400, contaDoRaziel);
		contaDoRaziel.transferir(250, contaDaSarah);
		System.out.println("\nTeste Transferência \nSarah"+contaDaSarah+"\nRaziel: "+contaDoRaziel);
		System.out.println("\nContas criadas: " + Conta.getTotal());
	}
}
