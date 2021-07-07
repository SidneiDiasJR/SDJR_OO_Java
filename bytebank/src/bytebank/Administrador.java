package bytebank;

public class Administrador extends Funcionario implements Autenticavel {
	//Atributos
	private int senha;
	
	//Construtor
	public Administrador(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		setSenha(senha);
	}
	
	//Bonificação do Administrador
	@Override
	public double getBonificacao() {
		return 20000;
	}
	
	//Métodos implementados
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
