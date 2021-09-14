package bytebank;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(Cliente titular, int agencia, int numero) {
		super(titular, agencia, numero);
	}
	
	//M�todo implementado
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}	
	//Sobrescri��o do m�todo sacar
	@Override
	public void sacar(double valor) {
		double taxa = 0.2;
		valor += taxa;
		super.sacar(valor);
	}
	
}
