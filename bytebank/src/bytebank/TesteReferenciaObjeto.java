package bytebank;

public class TesteReferenciaObjeto {
	public static void main(String[] args) {
		Cliente raziel = new Cliente("Raziel Leone", "111.111.111-11", "Arquiteto");
		Cliente sarah  = new Cliente("Sarah Zelo", "222.222.222-22", "Designer");		
		ContaPoupanca contaDoRaziel = new ContaPoupanca(raziel, 1234, 5678);
		System.out.println(contaDoRaziel.getTitular().getNome());		
		ContaPoupanca contaDaSarah = new ContaPoupanca(sarah,8765, 4321);
		System.out.println(contaDaSarah.getTitular().getNome());
		System.out.println(Conta.getTotal());
	}
}
