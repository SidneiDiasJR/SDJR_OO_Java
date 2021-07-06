package bytebank;

public class Gerente extends Funcionario {
	//Atributos
	private int senha;
	
	//Construtores
	public Gerente(int senha) {
		setSenha(senha);
	}
	
	//Setters
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	//Getters
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	//Autenticação da Senha
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
