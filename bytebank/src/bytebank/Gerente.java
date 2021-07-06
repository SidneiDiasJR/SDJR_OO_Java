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
	
	//Autenticação da Senha
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
	
	//toString
	public String toString() {
		return "\nNome: "    + getNome() +
			   "\nCPF: "     + getCpf() +
			   "\nSalário: " + getSalario();
	}
}
