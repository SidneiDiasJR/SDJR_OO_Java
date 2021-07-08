package bytebank;

public class TesteTributavel {
	public static void main(String[] args) {
		//Instâncias e Variáveis
		Cliente 			cliente 			= new Cliente("Dick Grayson", "222.222.222-2", 2222, "Segurança");
		ContaCorrente 		contaCorrente 		= new ContaCorrente(cliente, 1111, 2222);
		SeguroDeVida 		seguroDeVida 		= new SeguroDeVida();
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		//Teste dos métodos
		contaCorrente.depositar(1000);
		calculadorDeImposto.registra(seguroDeVida);
		calculadorDeImposto.registra(contaCorrente);
		
		System.out.println(calculadorDeImposto.getTotalImposto());
	}	
}
