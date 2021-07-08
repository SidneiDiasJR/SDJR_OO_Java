package bytebank;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(Cliente titular, int agencia, int numero) {
		super(titular, agencia, numero);
	}
	
	//Método implementado
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}	
	//Sobrescrição do método sacar
	@Override
	public boolean sacar(double valor) {
		double taxa = 0.2;
		valor += taxa;
		return super.sacar(valor);
	}
	
}
