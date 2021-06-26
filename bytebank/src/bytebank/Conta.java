package bytebank;

public class Conta {
	double saldo;
	int    agencia;
	int	   numero;
	String titular;
	
	void depositar (double valor) {
		this.saldo += valor;
	}
	
	boolean sacar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	boolean transferir (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		}
		return false;
	}
}
