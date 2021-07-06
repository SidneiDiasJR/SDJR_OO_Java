package bytebank;

public class TesteFuncionario {
	public static void main(String[] args) {
		//Instâncias e Variáveis
		Funcionario timDrake   = new Funcionario("Tim Drake", "444.444.444-4", 2200);
		Gerente     bruceWayne = new Gerente(123456789);
		boolean     autentica = false;
		
		//Teste da classe Funcionario
		System.out.println(timDrake);
		
		//Teste da classe Gerente
		bruceWayne.setNome("Bruce Wayne");
		bruceWayne.setCpf("000.000.000-0");
		bruceWayne.setSalario(50000);
		System.out.println(bruceWayne);
		autentica = bruceWayne.autentica(12345678);
		System.out.println("\n"+autentica);
		autentica = bruceWayne.autentica(123456789);
		System.out.println("\n"+autentica);
	}
}
