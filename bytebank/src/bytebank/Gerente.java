package bytebank;

public class Gerente extends Funcionario implements Autenticavel {
	//Atributos
	private int senha;
	
	//Construtor
	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		setSenha(senha);
	}
	
	//Bonifica��o do Gerente
	public double getBonificacao() {
		return super.getSalario();
	}
	
	//M�todos implementados
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
	
	//toString
	public String toString() {
		return super.toString();
	}
}
