package bytebank;

public abstract class Conta {
	//Atributos
	private 	   double  saldo;
	private        int     agencia;
	private        int	   numero;
	private 	   Cliente titular;
	private static int 	   total = 0;
	
	//Construtor
	public Conta(Cliente titular, int agencia, int numero) {
		setAgencia(agencia);
		setNumero(numero);
		setTitular(titular);
		System.out.println("Criando uma conta");
		Conta.total++;
	}
	
	//Setters
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//Depositar, Sacar e Transferir
	public void depositar (double valor) {
		this.saldo += valor;
	}
	public void sacar (double valor) {
		if (this.saldo < valor) {
			throw new SaldoException("Saldo Disponível: " + getSaldo() + "\nValor Saque: " + valor);
		}
		this.saldo -= valor;
	}	
	public boolean transferir (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	//Getters
	public double getSaldo() {
		return this.saldo;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public int getNumero() {
		return this.numero;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
	
	// toString
	@Override
	public String toString() {
		return /*getTitular()  +
			   "\nAgência: " + getAgencia() +
			   "\nNúmero: "  + getTitular() +*/
			   "\nSaldo: R$ " + getSaldo(); 
	}
}
