package bytebank;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente titular, int agencia, int numero) {
		super(titular, agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double taxa = 0.2;
		valor += taxa;
		return super.sacar(valor);
	}
}
