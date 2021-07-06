package bytebank;

public class TesteFuncionario {
	public static void main(String[] args) {
		//Instâncias e Variáveis
		Funcionario 		timDrake            = new Funcionario("Tim Drake", "444.444.444-4", 2200);
		Gerente     		bruceWayne          = new Gerente("Bruce Wayne", "000.000.000-0", 50000, 123456789);
		Funcionario 	    barbaraGordon       = new Seguranca("Barbara Gordon", "555.555.555-4", 4000);
		Funcionario 	    alfredPennyworth    = new OperadorLimpeza("Alfred Pennyworth", "111.111.111-1", 10000);
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		boolean     autentica = false;
		
		//Teste da classe Funcionario
		System.out.println(timDrake);
		
		//Teste da classe Gerente
		System.out.println(bruceWayne);
		autentica = bruceWayne.autentica(12345678);
		System.out.println("\n"+autentica);
		autentica = bruceWayne.autentica(123456789);
		System.out.println("\n"+autentica);
		
		//Teste das classes Seguranca e OperadorLimpeza
		System.out.println(barbaraGordon);
		System.out.println(alfredPennyworth+"\n");
		
		//Teste da classe controleBonificacao
		controleBonificacao.registra(timDrake);
		controleBonificacao.registra(bruceWayne);
		controleBonificacao.registra(barbaraGordon);
		controleBonificacao.registra(alfredPennyworth);
		System.out.println("Soma de todas as bonificações: " + controleBonificacao.getSoma());	
	}
}
