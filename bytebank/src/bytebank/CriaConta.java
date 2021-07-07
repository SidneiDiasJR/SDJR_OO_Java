package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		//Instâncias e Variáveis
		Cliente raziel 			    = new Cliente("Raziel Leone", "111.111.111-11");
		ContaCorrente primeiraConta = new ContaCorrente(raziel, 1234, 5678);
		
		//Teste métodos
		primeiraConta.depositar(300);
		System.out.println("\nPrimeira Conta " + primeiraConta.getSaldo());
		
		primeiraConta.depositar(100);;
		System.out.println("\nPrimeira Conta " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("\nPrimeira Conta " + primeiraConta.getSaldo());
		System.out.println("\nSegunda Conta "  + segundaConta.getSaldo());
		
		System.out.println("\nPrimeira Conta " + primeiraConta);
		System.out.println("\nSegunda Conta " + segundaConta);
		System.out.println("\nTotal de contas criadas: " + Conta.getTotal());
	}
}
