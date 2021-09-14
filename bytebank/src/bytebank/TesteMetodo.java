package bytebank;

public class TesteMetodo {
	public static void main(String[] args) {
		// Instancias e Veriáveis

		Cliente raziel = new Cliente("Raziel Leone", "111.111.111-11", 2222, "Arquiteto");
		Conta contaDoRaziel = new ContaCorrente(raziel, 8765, 4321);

		// Teste dos Métodos Conta
		contaDoRaziel.depositar(300);
		try {
			contaDoRaziel.sacar(300);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println(""+contaDoRaziel.getSaldo());
		
		System.out.println("\nContas criadas: " + Conta.getTotal());
	}
}
