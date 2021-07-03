package bytebank;

public class TesteMetodo { 
	public static void main (String[] args) {
		Conta contaDaSarah = new Conta(1234, 5678);
		Conta contaDoRaziel = new Conta(8765, 4321);
		
		contaDaSarah.depositar(1000);
		contaDoRaziel.depositar(300);
		System.out.println("\nSaldo da Sarah: "  + contaDaSarah.getSaldo() +
						   "\nSaldo do Raziel: " + contaDoRaziel.getSaldo() );
		contaDaSarah.sacar(200);
		contaDoRaziel.sacar(400);
		System.out.println("\nSaldo da Sarah: "  + contaDaSarah.getSaldo() +
				   		   "\nSaldo do Raziel: " + contaDoRaziel.getSaldo() );
		contaDaSarah.transferir(1200, contaDoRaziel);
		contaDoRaziel.transferir(250, contaDaSarah);
		System.out.println("\nSaldo da Sarah: "  + contaDaSarah.getSaldo() +
		   		   		   "\nSaldo do Raziel: " + contaDoRaziel.getSaldo() );		
		System.out.println(Conta.getTotal());
	}
}
