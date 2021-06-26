package bytebank;

public class TesteReferenciaObjeto {
	public static void main(String[] args) {
		Cliente raziel = new Cliente();
		Conta contaDoRaziel = new Conta();
		raziel.setNome("Raziel Leone");;
		contaDoRaziel.setTitular(raziel);;
		System.out.println(contaDoRaziel.getTitular().getNome());
		
		Conta contaDaSarah = new Conta();
		contaDaSarah.setTitular(new Cliente());
		contaDaSarah.getTitular().setNome("Sarah Zelo");
		System.out.println(contaDaSarah.getTitular().getNome());
	}
}
