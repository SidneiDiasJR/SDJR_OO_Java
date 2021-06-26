package bytebank;

public class TesteReferenciaObjeto {
	public static void main(String[] args) {
		Cliente raziel = new Cliente();
		Conta contaDoRaziel = new Conta();
		raziel.nome = "Raziel Leone";
		contaDoRaziel.titular = raziel;
		System.out.println(contaDoRaziel.titular.nome);
		
		Conta contaDaSarah = new Conta();
		contaDaSarah.titular = new Cliente();
		contaDaSarah.titular.nome = "Sarah Zelo";
		System.out.println(contaDaSarah.titular.nome);
	}
}
