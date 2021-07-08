package bytebank;

public class TesteTributavel {
	public static void main(String[] args) {
		//Inst�ncias e Vari�veis
		Cliente 			cliente 			= new Cliente("Dick Grayson", "222.222.222-2", 2222, "Seguran�a");
		ContaCorrente 		contaCorrente 		= new ContaCorrente(cliente, 1111, 2222);
		SeguroDeVida 		seguroDeVida 		= new SeguroDeVida();
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		//Teste dos m�todos
		contaCorrente.depositar(1000);
		calculadorDeImposto.registra(seguroDeVida);
		calculadorDeImposto.registra(contaCorrente);
		
		System.out.println(calculadorDeImposto.getTotalImposto());
	}	
}
