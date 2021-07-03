package bytebank;

public class TesteReferenciaObjeto {
	public static void main(String[] args) {
		Cliente raziel = new Cliente("Raziel Leone", "111.111.111-11", "Arquiteto");
		Conta contaDoRaziel = new Conta(1234, 5678);
		contaDoRaziel.setTitular(raziel);;
		System.out.println(contaDoRaziel.getTitular().getNome());
		
		Conta contaDaSarah = new Conta(8765, 4321);
		contaDaSarah.setTitular(new Cliente("Sarah Zelo", "222.222.222-22", "Designer"));
		System.out.println(contaDaSarah.getTitular().getNome());
		System.out.println(Conta.getTotal());
	}
}
