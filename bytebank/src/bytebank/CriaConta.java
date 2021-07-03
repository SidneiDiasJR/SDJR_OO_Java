package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1234, 5678);
		primeiraConta.depositar(300);;
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.depositar(100);;
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("A primeira conta tem " + primeiraConta.getSaldo());
		System.out.println("A segunda conta tem " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		System.out.println(Conta.getTotal());
	}
}
